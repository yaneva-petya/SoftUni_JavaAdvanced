package Excercises.IteratorsAndComparators.Problems.StrategyPattern_06;

import java.util.Comparator;

public class ComparatorByName implements Comparator<Person> {

    @Override
    public int compare(Person person1, Person person2) {

        int nameLengthComparingResult=
                Integer.compare(person1.getName().length(),
                        person2.getName().length());

        if(nameLengthComparingResult==0){
            char firstSymbolFirstName=person1.getName().toUpperCase().charAt(0);
            char firstSymbolSecondName=person2.getName().toUpperCase().charAt(0);
            return Character.compare(firstSymbolFirstName, firstSymbolSecondName);
        }

        return nameLengthComparingResult;
    }
}
