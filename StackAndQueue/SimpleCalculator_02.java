package Lectures.StackAndQueue.Programs.Stack;

import java.util.ArrayDeque;
import java.util.Collections;
import java.util.Scanner;

public class SimpleCalculator_02 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        String[] data=s.nextLine().split("\\s+");
        ArrayDeque<String> stack=new ArrayDeque<>();
        Collections.addAll(stack,data);//подрежда като в опашка

        while (stack.size()>1){
            int firstNumber=Integer.parseInt(stack.peek());
            stack.pop();
            String operator=stack.peek();
            stack.pop();
            int secondNumber=Integer.parseInt(stack.peek());
            stack.pop();

            int result;
            if(!operator.equals("-")){
                result=firstNumber+secondNumber;
            }
            else {
                result=firstNumber-secondNumber;
            }
            stack.push(String.valueOf(result));

        }
        System.out.println(stack.peek());

    }
}
