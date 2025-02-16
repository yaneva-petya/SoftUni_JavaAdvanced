package Excercises.IteratorsAndComparators.Problems.StrategyPattern_06;

import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int n=Integer.parseInt(s.nextLine());

        TreeSet<Person> orderedByName=new TreeSet<>(new ComparatorByName());
        TreeSet<Person> orderedByAge=new TreeSet<>(new ComparatorByAge());
        for(int i=0;i<n;i++){
            String input=s.nextLine();
            String name=input.split("\\s+")[0];
            Integer age=Integer.parseInt(input.split("\\s+")[1]);

            orderedByName.add(new Person(name, age));
            orderedByAge.add(new Person(name, age));

        }

        orderedByName.forEach(System.out::println);
        orderedByAge.forEach(System.out::println);

    }
}
