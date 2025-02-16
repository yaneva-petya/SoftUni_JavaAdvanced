package Lectures.Two_D_Arrays.Problems;

import java.util.Arrays;
import java.util.Scanner;

public class SumMatrixElements_04 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        String[] dimension=s.nextLine().split(", ");
        int rows=Integer.parseInt(dimension[0]);
        int columns=Integer.parseInt(dimension[1]);
        int[][] A=new int[rows][];

        fillMatrix(A,s);
        System.out.println(sumOfRows(A));
        System.out.println(sumOfColumns(A));
        System.out.println(sumOfElements(A));
    }

    public static void fillMatrix(int[][] A,Scanner s){
        for(int r=0;r<A.length;r++){
            int[] currentRow= Arrays.stream(s.nextLine().split(", ")).mapToInt(Integer::parseInt).toArray();
            A[r]=currentRow;
        }
    }

    public static int sumOfRows(int[][] A){
        int countOfRows=0;
        for (int r=0;r<A.length;r++){
            countOfRows+=1;
        }
        return countOfRows;
    }

    public static int sumOfColumns(int[][] A){
        int countOfColumns=0;
        for (int r=0;r<1;r++){
            for(int c=0;c<A[r].length;c++){
                countOfColumns+=1;
            }
        }
        return countOfColumns;
    }

    public static int sumOfElements(int[][] A){
        int sum=0;
        for (int r=0;r<A.length;r++){
            for(int c=0;c<A[r].length;c++){
                sum+=A[r][c];
            }
        }
        return sum;
    }
}
