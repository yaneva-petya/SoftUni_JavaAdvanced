package Excercises.IteratorsAndComparators.Problems.ComparingObjects_05;


import javax.swing.text.html.parser.TagElement;

public class Person implements Comparable<Person> {
    private String name;
    private Integer age;
    private String town;

    public String getName() {
        return name;
    }


    public Integer getAge() {
        return age;
    }


    public Person(String name, Integer age, String town) {
        this.name = name;
        this.age= age;
        this.town=town;
    }

    public String getTown() {
        return town;
    }

    @Override
    public int compareTo(Person otherPerson) {
        //compareTo() -> it returns 0, 1, -1;
        // 0 - equals values ;
        // 1 - different values ;

        //1. Сравняваме 2 имена
        int nameComparingResult=this.name.compareTo(otherPerson.name);
        //2. Сравнение по години
        int ageComparingResult=this.age.compareTo(otherPerson.age);
        //3. Сравнение по градове
        int townComparingResult=this.town.compareTo(otherPerson.town);

        if(nameComparingResult!=0){
            return nameComparingResult;
        }else if(ageComparingResult!=0) {
            return ageComparingResult;
        }else {
            return townComparingResult;
        }

    }
}
