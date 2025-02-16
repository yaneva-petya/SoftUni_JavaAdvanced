package Excercises.FunctionaProgramming.Problems;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;
import java.util.function.Function;

public class FindTheSmallestElement_07 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        List<Integer> numbers= Arrays.stream(s.nextLine().split("\\s+"))
                .map(Integer::parseInt).toList();

        int minElement= Collections.min(numbers);

        //numbers.lastIndexOf(10); -> връща последния индекс, на който срещаме елемента
        //numbers.indexOf(10); -> връща първия индекс, на който срещаме елемента

        System.out.println(numbers.lastIndexOf(minElement));
    }
}
