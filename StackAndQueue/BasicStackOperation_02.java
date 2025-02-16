package Excercises.StackAndQueue;

import java.util.ArrayDeque;
import java.util.Collections;
import java.util.Scanner;

public class BasicStackOperation_02 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        ArrayDeque<Integer> stack=new ArrayDeque<>();
        int countNumbersToPush=s.nextInt();
        int countNumbersToPop=s.nextInt();
        int numberToCheck=s.nextInt();

        for(int i=1;i<=countNumbersToPush;i++){
            int number=s.nextInt();
            stack.push(number);
        }

        for(int i=1;i<=countNumbersToPop;i++){
            //System.out.println( stack.pop());
            stack.pop();
        }

        if(stack.isEmpty()){System.out.println(0);}
        else if(stack.contains(numberToCheck)){System.out.println(true);}
        else{
            System.out.println(Collections.min(stack));
        }


    }
}
