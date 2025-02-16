package Excercises.StackAndQueue;

import java.util.ArrayDeque;
import java.util.Arrays;
import java.util.Collections;
import java.util.Scanner;

public class MaximumElement_03 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = Integer.parseInt(scanner.nextLine());

        ArrayDeque<Integer> stack = new ArrayDeque<>();

        for (int i = 1; i <= n ; i++) {
            String currentCommand = scanner.nextLine();

            int currentNumber = Integer.parseInt(currentCommand.split(" ")[0]);

            switch (currentNumber){
                case 1 -> {
                    int numberToPush = Integer.parseInt(currentCommand.split(" ")[1]);
                    stack.push(numberToPush);
                }
                case 2 -> stack.pop();
                case 3 -> System.out.println(Collections.max(stack));


            }

        }
    }
}
