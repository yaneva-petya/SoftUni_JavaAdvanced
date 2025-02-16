package Lectures.FunctionalProgramming.Problems;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.function.Predicate;

public class CountUppercaseWords_03 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);


       Predicate<String> startWithUpperCase=
               someText->Character.isUpperCase(someText.charAt(0));

        List<String> words=Arrays.stream(s.nextLine().split(" ")).
               filter(startWithUpperCase).toList();
        System.out.println(words.size());
        words.forEach(word->System.out.println(word));

    }
}
