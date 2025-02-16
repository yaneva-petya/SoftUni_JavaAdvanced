package Excercises.Two_D_Arrays;
import java.util.*;
public class Crossfire_07 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        String[] dimension=s.nextLine().split("\\s+");
        int rows=Integer.parseInt(dimension[0]);
        int cols=Integer.parseInt(dimension[1]);

       List<List<Integer>>matrix=new ArrayList<>();
        fillMatrix(rows,cols,matrix);
      //  printMatrix(matrix);

        String commands=s.nextLine();
        while (!commands.equals("Nuke it from orbit")){
            String[] data=commands.split("\\s+");
            int row=Integer.parseInt(data[0]);
            int col=Integer.parseInt(data[1]);
            int radius=Integer.parseInt(data[2]);

            for (int i=row-radius; i<=row+radius;i++){
                if(isInBound(i,col,matrix) && i!=row){
                    matrix.get(i).remove(col);
                }
            }

            for(int i=col+radius;i>=col-radius;i--){
              if( isInBound(row, i,matrix)){
                    matrix.get(row).remove(i);
              }
            }
            matrix.removeIf(List::isEmpty);

            commands=s.nextLine();
        }
 printMatrix(matrix);
    }
    public static boolean isInBound(int row, int col, List<List<Integer>> matrix){
        return row>=0 && row<matrix.size() && col>=0 && col<matrix.get(row).size();
    }

    public static void fillMatrix(int rows,int cols,List<List<Integer>> matrix){

        int num=1;
        for(int row=0;row<rows;row++){
            List<Integer> currentList=new ArrayList<>();
            for(int col=0;col<cols;col++){
                currentList.add(num);
                num++;
            }
            matrix.add(currentList);
        }
    }
    public static void printMatrix(List<List<Integer>> matrix){
       for(List<Integer> numbers:matrix){
           for(int num: numbers){
               System.out.print(num+" ");
           }
           System.out.println();
       }
    }
}
