package Lectures.StackAndQueue.Demo;

import java.util.ArrayDeque;
import java.util.Scanner;

public class StackAllImportantThings {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        //LIFO - Last In First Out
        ArrayDeque<Integer> stack = new ArrayDeque<>();

        int i;
        for (i=1;i<=5;i++){
            //push(element) - insert element on the top of the stack
            stack.push(i);
        }

        System.out.println("Size of stack: "+stack.size());
        System.out.println(stack.contains(3));//return true or false;

        //stack.forEach(System.out::println);
        while(!stack.isEmpty()){
            System.out.println(stack.pop());
        }

        // pop() - remove topmost element
        //int element = stack.pop();

        //peek() - get topmost element
        Integer el=stack.peek();


        //1:22
    }
}
