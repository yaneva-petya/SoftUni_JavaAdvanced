package Excercises.ClassesAndObjects.OpinionPollClass;

import java.util.Map;
import java.util.Scanner;
import java.util.TreeMap;
import java.util.function.Function;
import java.util.function.Predicate;

public class OpinionPollMain {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        int n=Integer.parseInt(s.nextLine());
        Map<String, Integer> people=new TreeMap<>();

        for(int i=0;i<n;i++){
            String input=s.nextLine();
            String name=input.split("\\s+")[0];
            int age=Integer.parseInt(input.split("\\s+")[1]);

            people.put(name, age);
        }

        Predicate<Integer> ageCheck= age->age>30;

        people.entrySet().stream()
                .filter(entry -> ageCheck.test(entry.getValue())) // Filter based on age
                .forEach(entry -> {
                    Person person = new Person(entry.getKey(), entry.getValue());
                    System.out.println(person.toString());
                });
    }
}
