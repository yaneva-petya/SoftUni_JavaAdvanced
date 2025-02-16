package Excercises.FunctionaProgramming.Problems;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.function.Consumer;
import java.util.function.Predicate;

public class PredicateForNames_06 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int size=Integer.parseInt(s.nextLine());
        List<String> names=
                Arrays.stream(s.nextLine().split("\\s+"))
                .toList();

        Predicate<String> nameCheck=name->name.length()<=size;
        names=names.stream().filter(nameCheck::test).toList();
        Consumer<String> printInfo=System.out::println;
        names.forEach(printInfo);
    }
}
