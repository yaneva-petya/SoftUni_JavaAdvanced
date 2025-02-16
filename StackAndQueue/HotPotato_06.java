package Lectures.StackAndQueue.Programs.Queue;

import java.util.ArrayDeque;
import java.util.Arrays;
import java.util.Objects;
import java.util.Scanner;

public class HotPotato_06 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        ArrayDeque<String> queue=new ArrayDeque<>();
        Arrays.stream(s.nextLine().split("\\s+")).forEach(queue::offer);

        int n=Integer.parseInt(s.nextLine());
        int counterRotations=0;

        while(queue.size()>1){
          String firstKid= queue.poll();
          counterRotations++;

          if(counterRotations%n==0){
              System.out.println("Removed "+firstKid);
          }else{
              queue.offer(firstKid);

          }
        }
        System.out.println("Last is "+queue.peek());

    }
}
