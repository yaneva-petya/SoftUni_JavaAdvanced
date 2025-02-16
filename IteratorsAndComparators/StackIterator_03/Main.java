package Excercises.IteratorsAndComparators.Problems.StackIterator_03;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
       Scanner s = new Scanner(System.in);

       CustomStack stack=new CustomStack();
       String command=s.nextLine();
       while (!"END".equals(command)){
           if(command.equals("Pop")){
               stack.pop();
           }else {
               int[] numbers= Arrays.stream(command.replace("Push ", "")
                       .split(", ")).mapToInt(Integer::parseInt).toArray();
               for(int number:numbers){
                   stack.push(number);
               }
           }
           command=s.nextLine();
       }
      for(Integer number:stack){
          System.out.println(number);
      }
        for(Integer number:stack){
            System.out.println(number);
        }
    }
}
