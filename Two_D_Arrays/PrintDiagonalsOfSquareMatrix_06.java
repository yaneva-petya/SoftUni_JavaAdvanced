package Lectures.Two_D_Arrays.Problems;

import java.util.Arrays;
import java.util.Scanner;

public class PrintDiagonalsOfSquareMatrix_06 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        int rows=Integer.parseInt(s.nextLine());
        int[][] A =new int[rows][];
        fillMatrix(A,s);
//System.out.println(A.length);
findPrimaryDiagonal(A);
System.out.println();
findSecondaryDiagonal(A);
    }

    public static void fillMatrix(int[][] A, Scanner s){
        for(int i=0;i<A.length;i++){
          int[] currentRow= Arrays.stream(s.nextLine().split("\\s+"))
                  .mapToInt(Integer::parseInt).toArray();
          A[i]=currentRow;
        }
    }

    public static void findPrimaryDiagonal(int[][] A){
        for(int r=0;r<A.length;r++){
            System.out.print(A[r][r]+" ");
        }
    }

   public static void findSecondaryDiagonal(int[][] A){
        int counter=0;
        for(int r=A.length-1;r>=0;r--) {
            System.out.print(A[r][counter]+" ");
            counter++;
        }
    }
}
