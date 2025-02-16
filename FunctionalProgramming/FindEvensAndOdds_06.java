package Lectures.FunctionalProgramming.Problems;

import java.util.Arrays;
import java.util.Scanner;
import java.util.function.Predicate;

public class FindEvensAndOdds_06 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        int[] bounds=Arrays.stream(s.nextLine().split(" "))
                .mapToInt(Integer::parseInt).toArray();

        String condition=s.nextLine();

        if("odd".equals(condition)){
           printNumbers(bounds, num->num%2!=0);
        }else {
            printNumbers(bounds, num->num%2==0);
        }
    }

    private static void printNumbers(int[] bounds, Predicate<Integer> condition){
        int lower=bounds[0],upper =bounds[1];
        for (int i=lower;i<=upper;i++){
            if(condition.test(i)){
                System.out.print(i+" ");
            }
        }

    }
}
