package Lectures.Two_D_Arrays.Problems;

import java.util.Scanner;

public class FindTheRealQueen_07 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        char[][] matrix=new char[8][8];
        fillMatrix(matrix,s);

        for(int r=0;r<matrix.length;r++){
            for(int c=0;c<matrix[r].length;c++){
                if(matrix[r][c]=='q'){

                    boolean upPrimaryDiagonal=isUpPrimaryDiagonal(matrix, r-1,c-1) ;
                    boolean downPrimaryDiagonal=isDownPrimaryDiagonal(matrix,r+1,c+1);
                    boolean upSecondaryDiagonal=isUpSecondaryDiagonal(matrix,r-1,c+1) ;
                    boolean downSecondaryDiagonal=isDownSecondaryDiagonal(matrix,r+1,c-1) ;
                    boolean clearRow=isRowClear(matrix, r);
                    boolean clearCol=isColClear(matrix,c);

                    if(upPrimaryDiagonal && downPrimaryDiagonal &&
                    upSecondaryDiagonal && downSecondaryDiagonal &&
                    clearRow && clearCol){
                        System.out.println(r+" "+ c);
                        return;
                    }
                }
            }
        }

    }

    private static boolean isColClear(char[][] matrix, int c) {
      int queenCount=0;
       for(int r=0;r<matrix.length;r++){
           if(matrix[r][c]=='q'){
               queenCount++;

           }
       }
       return queenCount==1;
    }

    private static boolean isRowClear(char[][] matrix, int r) {
        int queenCount=0;
        for(int c=0;c<matrix.length;c++){
            if(matrix[r][c]=='q'){
                queenCount++;

            }
        }
        return queenCount==1;
    }

    private static boolean isDownSecondaryDiagonal(char[][] matrix, int row, int col) {
    while(row<=7 && col>=0){
        if(matrix[row][col]=='q'){
            return false;
        }
        row++;col--;
    }
    return true;
    }

    private static boolean isUpSecondaryDiagonal(char[][] matrix, int row, int col) {
       while(row>=0 && col<=7){
           if(matrix[row][col]=='q'){
               return false;
           }
           row--;col++;
       }
        return true;
    }

    public static void fillMatrix(char[][]A, Scanner s){
        for(int r=0;r<A.length;r++){
            String currentInput=s.nextLine().replace(" ", "");
            char[] currentRow=currentInput.toCharArray();
            A[r]=currentRow;
        }
    }

    public static boolean isUpPrimaryDiagonal(char[][] A, int currentRow, int currentCol){
        while (currentRow>=0 && currentCol>=0){
            if(A[currentRow][currentCol]=='q'){
                return false;

            }
            currentRow--;currentCol--;
        }

        return true;
    }
    public static boolean isDownPrimaryDiagonal(char[][] A, int currentRow, int currentCol){
        while (currentRow<=7 && currentCol<=7){
            if(A[currentRow][currentCol]=='q'){
                return false;

            }
            currentRow++;currentCol++;
        }

        return true;
    }
}
