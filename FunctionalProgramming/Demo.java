package Excercises.FunctionaProgramming.Demo;

import java.util.Arrays;
import java.util.List;

public class Demo {
    public static void main(String[] args) {
        List<String> students= Arrays.asList("Petya", "Stoyan", "Peter", "Yana");

        //Imperative/Structured type
      /*  for(String student:students){
            if(student.startsWith("P")){
                System.out.println(student);
            }
        }*/

        //Functional/Declarative type - lambda expression
        students.stream()
                //filter is used with Predicate - returns a boolean value
                .filter(student->student.startsWith("P"))
                //forEach is used with Consumer
                .forEach(System.out::println);
    }
}
