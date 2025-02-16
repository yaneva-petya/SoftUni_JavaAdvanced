package Excercises.FunctionaProgramming.Problems;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.function.Consumer;
import java.util.function.Predicate;


public class ReverseAndExclude_05 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        List<Integer> numbers= Arrays.stream(s.nextLine().split("\\s+"))
                .map(Integer::parseInt).toList();

        int divider=Integer.parseInt(s.nextLine());
        Predicate<Integer> isDivided=num->num%divider!=0;

        List<Integer> newList=numbers.stream().
                filter(num->isDivided.test(num)).toList();

        Consumer<Integer> printInfo=num->System.out.printf(num+" ");
        newList.reversed().forEach(printInfo);
    }
}
