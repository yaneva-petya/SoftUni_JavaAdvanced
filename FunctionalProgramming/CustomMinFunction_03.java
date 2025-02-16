package Excercises.FunctionaProgramming.Problems;

import java.util.*;
import java.util.stream.Collectors;

public class CustomMinFunction_03 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

       List<Integer> numbers= Arrays.stream(s.nextLine().split("\\s+"))
               .map(Integer::parseInt).toList();

      System.out.println(Collections.min(numbers));

        //My code
       /* int[] numbers= Arrays.stream(s.nextLine().split("\\s+"))
                .mapToInt(Integer::parseInt).toArray();

        OptionalInt minNumber=
                Arrays.stream(numbers).min();
        System.out.println(minNumber.getAsInt());*/


    }
}
