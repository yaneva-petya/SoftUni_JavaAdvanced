package Excercises.FunctionaProgramming.Problems;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.stream.Collectors;

public class AppliedArithmetic_04 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        List<Integer> numbers= Arrays.stream(s.nextLine().split("\\s+"))
                .map(Integer::parseInt).toList();

        //"add" -> adds 1;
        // "multiply" -> multiplies by 2;
        // "subtract" -> subtracts 1;
        // "print" -> prints all numbers on a new line.


        String command=s.nextLine();

        //add 1
        Function<Integer,Integer> funcAdd=num->num+1;
        //multiply by 2
        Function<Integer,Integer> ficMul=num->num*2;
        //subtract 1
        Function<Integer,Integer> fucSub=num->num-1;

        Consumer<Integer> printInfo= num->System.out.print(num+" ");

        while (!command.equals("end")){
            if(command.equals("add")){
               numbers=numbers.stream().map(num->funcAdd.apply(num)).collect(Collectors.toList());
            }else if(command.equals("multiply")){
               numbers=numbers.stream().map(num->ficMul.apply(num)).collect(Collectors.toList());
            } else if (command.equals("subtract")) {
              numbers= numbers.stream().map(num->fucSub.apply(num)).collect(Collectors.toList());
            }else {
              numbers.forEach(printInfo);
              System.out.println();
            }


            command=s.nextLine();
        }


    }
}
