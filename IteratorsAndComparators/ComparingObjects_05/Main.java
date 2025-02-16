package Excercises.IteratorsAndComparators.Problems.ComparingObjects_05;

import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        String input=s.nextLine();
        List<Person> personList=new ArrayList<>();
        while (!input.equals("END")){
            String[] dataPerson=input.split("\\s+");

            String name=dataPerson[0];
            int age=Integer.parseInt(dataPerson[1]);
            String town=dataPerson[2];

            personList.add(new Person(name, age, town));

            input=s.nextLine();
        }

        int index=Integer.parseInt(s.nextLine());
        //Finding the person at this index, then we are comparing him with others

        Person specialPerson=personList.get(index-1);

        int countEquals=0;

        for (Person person:personList){
            if(person.compareTo(specialPerson)==0){
                countEquals+=1;
            }
        }

        if(countEquals==1){
            System.out.println("No matches");
        }else {
            System.out.printf("%d %d %d", countEquals,personList.size()-countEquals, personList.size());
        }



    }
}
