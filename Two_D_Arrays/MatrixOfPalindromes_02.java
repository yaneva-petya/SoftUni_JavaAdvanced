package Excercises.Two_D_Arrays;

import java.util.*;

public class MatrixOfPalindromes_02 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        String[] input=s.nextLine().split("\\s+");
        int rows=Integer.parseInt(input[0]);
        int columns=Integer.parseInt(input[1]);
        String[][] matrix=new String[rows][columns];

        palindromesMatrix(matrix);
        printMatrix(matrix);

    }
    public static void palindromesMatrix(String [][]a){
        for(int row=0;row<a.length;row++){
            for(int col=0;col<a[row].length;col++){
                char char1and3= (char) (97+row);
                char char2=(char)(97+row+col);
              StringBuilder fill=new StringBuilder().append(char1and3)
                      .append(char2).append(char1and3);
              a[row][col]=fill.toString();
            }
        }
    }

    public static void printMatrix(String[][]matrix){
        for(int i=0;i<matrix.length;i++){
            for(int j=0;j<matrix[i].length;j++){
                System.out.print(matrix[i][j]+" ");
            }
            System.out.println();
        }
    }
}
