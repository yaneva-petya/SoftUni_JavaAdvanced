package Lectures.FunctionalProgramming.Problems;

import java.util.*;

import static java.util.Arrays.*;

public class SortEvenNumbersImperative_01 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

         List<Integer> evenNumbers=Arrays.stream(s.nextLine().split(", "))
                .map(Integer::parseInt)
                 //.map(x -> Integer.parseInt(x))
                .filter(number -> number % 2 == 0).toList();

         System.out.println(evenNumbers.toString()
                 .replaceAll("\\["," ")
                 .replaceAll("\\]"," "));

        List<Integer> sortedEvenNumbers= evenNumbers.stream().sorted().toList();
                //.sorted((a,b)->b.compareTo(a)).toList();
        System.out.println(sortedEvenNumbers.toString()
                .replaceAll("\\["," ")
                .replaceAll("\\]"," "));


       /* List<Integer> numbers = Arrays.stream(s.nextLine().split(", "))
                .map((x)->Integer.parseInt(x))//lambda expression
                .toList();

       List<Integer> evenNumbers=new ArrayList<>();

       for(int num:numbers){
           if(num%2==0) evenNumbers.add(num);
       }
        for (int num:evenNumbers){
            System.out.print(num+" ");
        }System.out.println();

        Collections.sort(evenNumbers);
       for (int num:evenNumbers){
           System.out.print(num+" ");
       }*/

    }
}
