package Excercises.Two_D_Arrays;

import java.util.*;

public class MatrixShuffling_05 {
    public static void main(String[] args) {
       Scanner s = new Scanner(System.in);
       String[] dimensions=s.nextLine().split("\\s+");

       int rows=Integer.parseInt(dimensions[0]);
       int cols=Integer.parseInt(dimensions[1]);

       String[][] matrix=new String[rows][cols];
       String splitPattern="\\s+";

       ReadMatrix(matrix,splitPattern,rows,cols,s);

       String input=s.nextLine();
       while (!input.equals("END")){
           String[] data=input.split("\\s+");
           String command=data[0];

           if(command.equals("swap") && data.length==5){
               int r1=Integer.parseInt(data[1]);
               int c1=Integer.parseInt(data[2]);
               int r2=Integer.parseInt(data[3]);
               int c2=Integer.parseInt(data[4]);


                if(checkingBounds(matrix,r1,r2,c1,c2)) {
                    swap(matrix,r1,c1,r2,c2);
                    printMatrix(matrix);}
                else System.out.println("Invalid input!");
           }
           else System.out.println("Invalid input!");

           input=s.nextLine();
       }

    }
    public static String[][] ReadMatrix(String[][] matrix,String pattern, int rows,int cols, Scanner s ){
        for(int row=0;row<matrix.length;row++){
            String[] input=s.nextLine().split(pattern);
             for(int col=0;col<matrix[row].length;col++){
                 String currentString=input[col];

                 matrix[row][col]=currentString;
             }
        }
        return matrix;
    }
    public static void swap(String[][]matrix,int r1,int c1, int r2,int c2){
               String temp=matrix[r1][c1];
               matrix[r1][c1]=matrix[r2][c2];
               matrix[r2][c2]=temp;

    }

    public static boolean checkingBounds(String[][] matrix,int r1, int r2, int c1, int c2){
        int rows=matrix.length;
        int cols=matrix[0].length;
      return c1>=0 && c1<cols && c2>=0 && c2<cols && r1>=0 && r1<rows && r2>=0 && r2<rows;
    }
    public static void printMatrix(String[][] a){
        for (int r=0;r<a.length;r++){
            for(int c=0;c<a[r].length;c++){
                System.out.print(a[r][c]+" ");
            }System.out.println();
        }

    }
}
