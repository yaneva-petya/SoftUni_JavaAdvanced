package Excercises.StackAndQueue;

import java.util.ArrayDeque;
import java.util.Collections;
import java.util.Scanner;

public class BasicQueueOperations_04 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        ArrayDeque<Integer> queue=new ArrayDeque<>();
        int countNumbersToPush=s.nextInt();
        int countNumbersToPop=s.nextInt();
        int numberToCheck=s.nextInt();

        for(int i=1;i<=countNumbersToPush;i++){
            int number=s.nextInt();
            queue.offer(number);
        }

        for(int i=1;i<=countNumbersToPop;i++){
            //System.out.println( stack.pop());
            queue.poll();
        }

        if(queue.isEmpty()){System.out.println(0);}
        else if(queue.contains(numberToCheck)){System.out.println(true);}
        else{
            System.out.println(Collections.min(queue));
        }

    }
}
