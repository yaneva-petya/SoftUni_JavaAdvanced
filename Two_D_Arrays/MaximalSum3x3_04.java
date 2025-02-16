package Excercises.Two_D_Arrays;

import java.util.*;

public class MaximalSum3x3_04 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        String[] input=s.nextLine().split("\\s+");
        int rows=Integer.parseInt(input[0]);
        int columns=Integer.parseInt(input[1]);
        int[][] matrix=new int[rows][columns];
        fillMatrix(matrix,s);

        if(rows==3 && columns==3){
            sumOfElements(matrix);
            return;
        }


       Sum3x3(matrix);

    }
    public static void fillMatrix(int[][]a, Scanner s){
        for(int row=0;row<a.length;row++){
            int[] input=Arrays.stream(s.nextLine().split(" "))
                    .mapToInt(Integer::parseInt).toArray();
            a[row]=input;
        }
    }
    public static void Sum3x3(int[][]a){
        int maxSum=0;
        int currentRow=0;
        int currentCol=0;


        for(int row=0;row<a.length-2;row++){
             for(int col=0;col<a[row].length-2;col++){
                 int currentSumOfSubmatrix=
                         a[row][col]+a[row][col+1]+a[row][col+2]+
                         a[row+1][col]+a[row+1][col+1]+a[row+1][col+2]+
                         a[row+2][col]+a[row+2][col+1]+a[row+2][col+2];

                 if(currentSumOfSubmatrix>=maxSum){
                     maxSum=currentSumOfSubmatrix;
                     currentRow=row;
                     currentCol=col;
                 }
             }
        }
        System.out.println("Sum = "+maxSum);
        printSubMatrix(a,currentRow,currentCol);

    }

    public static void printSubMatrix(int[][]a, int row, int col){
        for(int r=0;r<3;r++){
            for(int c=0;c<3;c++){
                System.out.print(a[r+row][c+col]+" ");
            }System.out.println();
        }
    }

    public static void sumOfElements(int[][]a)
    {int sum=0;
        for(int r=0;r<a.length;r++){
            for(int c=0;c<a[r].length;c++){
                sum+=a[r][c];
            }
        }
        System.out.println("Sum = "+sum);
        printArr(a);

    }

    public static void printArr(int[][] a){
        for(int r=0;r<a.length;r++){
            for(int c=0;c<a[r].length;c++){
                System.out.print(a[r][c]+" ");
            }System.out.println();
        }
    }

}
