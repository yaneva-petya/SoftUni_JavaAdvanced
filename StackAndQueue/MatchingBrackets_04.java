package Lectures.StackAndQueue.Programs.Stack;

import java.util.ArrayDeque;
import java.util.Scanner;

public class MatchingBrackets_04 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        String expression=s.nextLine();
        ArrayDeque<Integer> indexesStack=new ArrayDeque<>();

        for(int i =0;i<expression.length();i++){
            char symbol=expression.charAt(i);

            if(symbol=='('){
                indexesStack.push(i);
            }else if(symbol==')'){
                int startingIndex=indexesStack.pop();
                String subexpression=expression.substring(startingIndex,i+1);
                System.out.println(subexpression);
            }
        }
    }
}
