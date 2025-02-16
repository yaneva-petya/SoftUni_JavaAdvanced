package Excercises.IteratorsAndComparators.Problems.Froggy_04;

import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        List<Integer> lakeList= Arrays.stream(s.nextLine().split(", "))
                .map(Integer::parseInt).toList();


        Lake lake =new Lake(lakeList);
        List<String> output=new ArrayList<>();
        for (Integer number:lake){
            output.add(number.toString());
        }
        System.out.println(String.join(", ", output));
    }
}
