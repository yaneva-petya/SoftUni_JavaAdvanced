package Excercises.StackAndQueue;

import java.util.ArrayDeque;
import java.util.Scanner;

public class ReverseNumbersWithAStack_01 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        ArrayDeque<String> stack=new ArrayDeque<>();


        String[] input=s.nextLine().split(" ");
       /*String input=s.nextLine();
        Arrays.stream(Arrays.stream(input.split("\\s+"))
                .forEach(stack::push);*/

        for(String number:input){
            stack.push(number);
        }
        while (!stack.isEmpty()){
        stack.forEach(n->System.out.print(stack.pop()+" "));}
    }
}
