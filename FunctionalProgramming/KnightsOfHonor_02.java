package Excercises.FunctionaProgramming.Problems;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.function.Consumer;

public class KnightsOfHonor_02 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        List<String> people= Arrays.stream(s.nextLine().split("\\s+")).toList();

        Consumer<String> printInfo=person->System.out.print("Sir "+person+"\n");
        people.forEach(printInfo);
    }
}
