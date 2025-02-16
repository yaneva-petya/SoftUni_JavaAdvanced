package Lectures.Two_D_Arrays.Problems;

import java.util.Arrays;
import java.util.Scanner;

public class IntersectionOfTwoMatrices_03 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        int rows=Integer.parseInt(s.nextLine());
        int columns=Integer.parseInt(s.nextLine());

        char[][] A=new char[rows][];
        char[][] B=new char[rows][];

        fillMatrix(A,s);
        fillMatrix(B,s);

       printMatrix(A,B);



    }
    public static void fillMatrix(char[][] matrix,Scanner s){
        for(int r=0;r< matrix.length;r++){
            String currentLine=s.nextLine().replace(" ","");
           char[] currentRow=currentLine.toCharArray();
           matrix[r]=currentRow;

        }
    }

    public static void printMatrix(char[][]A, char[][]B){
        for(int r=0;r<A.length;r++){
            for(int c=0;c<A[r].length;c++){
                if(A[r][c]==B[r][c]){
                    System.out.print(A[r][c]+" ");
                }
                else{
                    System.out.print("* ");
                }
            }
            System.out.println();
        }
    }
}
