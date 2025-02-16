package Lectures.Two_D_Arrays.Problems;

import java.util.Arrays;
import java.util.Scanner;

public class WrongMeasurements_08 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        int rows=Integer.parseInt(s.nextLine());
        int[][]A=new int[rows][];
        fillMatrix(A,s);

        String[] invalidData=s.nextLine().split(" ");
        int ind1=Integer.parseInt(invalidData[0]);
        int ind2=Integer.parseInt(invalidData[1]);

        int searchingElement=A[ind1][ind2];

        for(int row=0;row<A.length;row++){

            for(int col=0;col<A[row].length;col++){
                if(A[row][col]==searchingElement){
                    int up=UpElement(A,row,col);
                    int down=downElement(A,row,col);
                    int left=leftElement(A, row,col);
                    int right=rightElemet(A,row,col);
                    int newElement=0;
                    if(up!=searchingElement){newElement+=up;}
                    if(down!=searchingElement){newElement+=down;}
                    if(left!=searchingElement){newElement+=left;}
                    if(right!=searchingElement){newElement+=right;}

                    System.out.print(newElement+" ");


                }
                else{
                    System.out.print(A[row][col]+" ");
                }
            }
            System.out.println();
        }
    }

    private static int rightElemet(int[][] a, int row, int col) {
        if(col!=a[row].length-1)
            return a[row][col+1];
        return 0;
    }

    private static int leftElement(int[][] a, int row, int col) {
        if(col!=0)
            return a[row][col-1];
        return 0;

    }

    private static int downElement(int[][] a, int row, int col) {
        if(row!=a.length-1){
            return a[row+1][col];}
        return 0;
    }

    private static int UpElement(int[][] a, int row, int col) {
                if(row==0){
                    return 0;
                }else{
                    return a[row-1][col];
                }
    }

    public static void fillMatrix(int[][] A, Scanner s){
        for(int row=0;row<A.length;row++){
            int[] currentRow= Arrays.stream(s.nextLine().split("\\s+"))
                    .mapToInt(Integer::parseInt).toArray();
            A[row]=currentRow;
        }
    }
}
