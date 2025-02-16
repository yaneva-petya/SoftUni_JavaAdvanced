package Excercises.StackAndQueue;

import java.util.ArrayDeque;
import java.util.Scanner;

public class BalancedParentheses_05 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        String input = s.nextLine();
        ArrayDeque<Character> openBracketsStack = new ArrayDeque<>();

        for (int i = 0; i < input.length(); i++) {
            char currentSymbol = input.charAt(i);

            if (currentSymbol == '(' || currentSymbol == '{'
                    || currentSymbol == '[') {
                openBracketsStack.push(currentSymbol);

            } else {
                if (openBracketsStack.isEmpty() || !matchBrackets(openBracketsStack.pop(), currentSymbol)) {
                    System.out.println("NO");
                    return;
                }
            }

        }
        //If we have as an input only open brackets!!!
        if(openBracketsStack.isEmpty())
        { System.out.println("YES");}
         else{
             System.out.println("NO");
        }
    }
    public static boolean matchBrackets(char openBracket, char closeBracket){
        if(openBracket=='('){
            return closeBracket==')';

        }else if(openBracket=='{'){
            return closeBracket=='}';

        }else
            return closeBracket==']';
        }

    }


