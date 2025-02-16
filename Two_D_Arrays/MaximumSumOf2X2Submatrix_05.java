package Lectures.Two_D_Arrays.Problems;

import java.util.Arrays;
import java.util.Scanner;

public class MaximumSumOf2X2Submatrix_05 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        String[] dimensions=s.nextLine().split(", ");
        int rows=Integer.parseInt(dimensions[0]);
        int columns=Integer.parseInt(dimensions[1]);
        int[][] matrix=new int[rows][];
        fillMatrix(matrix,s);


        int maxSumSubmatrixElements=0;
        int currentRow=0;
        int currentColumn=0;

        for(int r=0;r<rows-1;r++){
            for(int c=0;c<columns-1;c++){

                int currentSumOfSubmatrix=matrix[r][c]+matrix[r][c+1]
                        +matrix[r+1][c]+matrix[r+1][c+1];

                if(maxSumSubmatrixElements<currentSumOfSubmatrix){
                    maxSumSubmatrixElements=currentSumOfSubmatrix;
                    currentRow=r;
                    currentColumn=c;
                }
            }
        }

       submatrix(matrix,currentRow,currentColumn);

        System.out.println(maxSumSubmatrixElements);
    }

    public static void fillMatrix(int[][] A, Scanner s){
        for(int r=0;r<A.length;r++){
            int[] currentRow= Arrays.stream(s.nextLine().split(", "))
                    .mapToInt(Integer::parseInt).toArray();
            A[r]=currentRow;
        }
    }
    public static void submatrix(int[][]matrix,int currentRow, int currentColumn){
        for(int row=0;row<2;row++){
            for(int column=0;column<2;column++){
                System.out.print(matrix[currentRow+row][currentColumn+column]+" ");
            }System.out.println();
        }
    }
}
