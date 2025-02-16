package Lectures.FunctionalProgramming.Problems;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.function.Function;

public class SumNumbers_02 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        String input=s.nextLine();
        Function<String,Integer> sumNumbers=numbersString->{
          int sum=Arrays.stream(numbersString.split(", "))
                  .mapToInt(Integer::parseInt)
                  .sum();
          return sum;
        };

        Function<String, Integer> countOfNumbers=numbersString->{
            int length=numbersString.split(", ").length;
            return length;
        };
        System.out.printf("Count = %d\n", countOfNumbers.apply(input));
        System.out.printf("Sum = %d\n", sumNumbers.apply(input));


    }
}
