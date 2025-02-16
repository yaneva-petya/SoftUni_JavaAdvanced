package Excercises.Two_D_Arrays;

import javax.swing.*;
import java.util.*;

public class FillTheMatrix_01 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        String[] data=s.nextLine().split(", ");

        int n=Integer.parseInt(data[0]);
        char input=data[1].charAt(0);

        int[][]a=new int[n][n];


        if(input=='A'){
            patternA(a);
        }
        else{
            patternB(a);
        }
print(a);

    }



    public static void patternA(int[][]a){
        int count=1;
        for(int col=0;col<a.length;col++){
            for(int row=0;row< a.length;row++){
                a[row][col]=count++;

            }
        }
    }

    public static void patternB(int[][]a){
        int count=1;
        for(int col=0;col<a.length;col++){
            if(col%2==0){
               for(int row=0;row<a.length;row++){
                   a[row][col]=count++;
               }
            }else if(col%2!=0){
                for(int row=a.length-1;row>=0;row--){
                    a[row][col]=count++;
                }
            }
        }
    }
    public static void print(int[][]a){
        for(int i=0;i<a.length;i++){
            for(int j=0;j<a.length;j++){
                System.out.print(a[i][j]+" ");
            }System.out.println();
        }
    }
}
