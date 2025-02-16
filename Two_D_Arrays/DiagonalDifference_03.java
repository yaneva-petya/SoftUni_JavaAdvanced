package Excercises.Two_D_Arrays;

import java.util.Arrays;
import java.util.Scanner;

public class DiagonalDifference_03 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        int n=Integer.parseInt(s.nextLine());
        int[][] matrix=new int[n][n];

       fillMatrix(matrix,s);
       System.out.println(diagonalDifference(matrix));
    }

    public static void fillMatrix(int[][] matrix, Scanner s){

        for(int i=0;i<matrix.length;i++){
            int[] input= Arrays.stream(s.nextLine().split(" "))
                    .mapToInt(Integer::parseInt).toArray();
            matrix[i]=input;
        }
    }

    public static int primaryDiagonalSum(int[][] matrix){
        int sum=0;
        for(int i=0;i<matrix.length;i++){
           sum+=matrix[i][i];
        }
return sum;
    }

    public static int secondaryDiagonalSum(int[][] matrix){
        int index=0, sum=0;
        for(int row=matrix.length-1;row>=0;row--){
            sum+=matrix[row][index++];
        }
        return sum;
    }

    public static int diagonalDifference(int[][] a){
        int primary=primaryDiagonalSum(a);
        int secondary=secondaryDiagonalSum(a);

        return (int) Math.abs(primary-secondary);
    }
}
