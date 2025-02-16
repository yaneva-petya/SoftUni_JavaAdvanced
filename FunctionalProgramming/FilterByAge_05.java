package Lectures.FunctionalProgramming.Problems;

import java.util.*;
import java.util.function.Consumer;
import java.util.function.Predicate;

public class FilterByAge_05 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        int n=Integer.parseInt(s.nextLine());


        Map<String, Integer> personInfo=new LinkedHashMap<>();

        for(int i=0;i<n;i++){
            String[] input =s.nextLine().split(", ");
            String name=input[0];
            int age=Integer.parseInt(input[1]);
            personInfo.put(name, age);
        }

        /*Condition - "younger" or "older"
        Age - Integer
        Format - "name", "age" or "name age*/

        String condition=s.nextLine();
        int ageLimit=Integer.parseInt(s.nextLine());
        String printFormat=s.nextLine();

        //2 - predicate
        //Predicate<Integer> agePredicate;
        Predicate<Map.Entry<String, Integer>> agePredicate;
        if("younger".equals(condition)){
            agePredicate=entry->entry.getValue()<=ageLimit;
        }else {
            agePredicate=entry-> entry.getValue()>=ageLimit;
        }

        //3 - consumer
        Consumer<Map.Entry<String, Integer>> print;
        if("name".equals(printFormat)){
            print=entry->System.out.println(entry.getKey());
        }else if("age".equals(printFormat)){
            print=entry->System.out.println(entry.getValue());
        }else {
            print=entry->System.out.printf("%s - %s\n", entry.getKey(),entry.getValue());
        }

        personInfo.entrySet().stream()
                .filter(agePredicate)
                //.filter(entry->agePredicate.test(entry.getValue()))
                .forEach(print);
    }
}
