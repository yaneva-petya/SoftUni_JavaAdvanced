package Lectures.StackAndQueue.Programs.Stack;

import java.util.ArrayDeque;
import java.util.Scanner;

public class DecimalToBinaryConverter_03 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        int decimal=Integer.parseInt(s.nextLine());
        ArrayDeque<Integer> binaryStack=new ArrayDeque<>();

        if(decimal==0){System.out.println(0);}
        else{
            while(decimal>0){
               int num= decimal%2;
               binaryStack.push(num);
               decimal/=2;
            }
        }

        binaryStack.forEach(n->System.out.print(n));
    }
}
