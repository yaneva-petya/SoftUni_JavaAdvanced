package Excercises.FunctionaProgramming.Problems;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.function.Consumer;

public class ConsumerPrint_01 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        List<String> people= Arrays.stream(s.nextLine().split("\\s+"))
                .toList();

        Consumer<String> printInfo= System.out::println;
        people.forEach(printInfo);

    }
}
