package Excercises.FunctionaProgramming.Problems;

import java.util.*;

public class CustomComparator_08 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        List<Integer> numbers= Arrays.stream(s.nextLine().split("\\s+"))
                .map(Integer::parseInt).toList();

        //Left - Even numbers
        //Right - Odd numbers

        Comparator<Integer> customComparator=((first, second)->{

            //Example: (2, 3)
            //first - even, second - odd -> do not swap them -> -1
            if(first%2==0 && second%2!=0){
                return -1;
            }
            //Example: (3, 2)
            //first - odd, second - even -> swap them -> 1
            else if(first%2!=0 && second%2==0){
                return 1;
            //first - even, second - even ->(2,4), (4,2)
            //first - odd, second - odd
            }else {
               return first.compareTo(second);
            }
        });
        numbers.stream().sorted(customComparator).forEach(num->System.out.print(num+" "));


        /*Predicate<Integer> evenNum= num->num%2==0;
        Predicate<Integer> oddNum=num->num%2!=0;

        List<Integer> odd=numbers.stream()
                .filter(oddNum::test).sorted().toList();

        List<Integer> even=numbers.stream()
                .filter(evenNum::test).sorted().toList();

        List<Integer> finalList=new ArrayList<>();

        even.forEach(num->finalList.add(num));
        odd.forEach(num->finalList.add(num));
        Consumer<Integer> print=n->System.out.print(n+" ");
        finalList.forEach(print);*/

    }
}
