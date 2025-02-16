package Excercises.ClassesAndObjects.OpinionPollClass;

public class Person {
    private String name;
    private int age;

    public Person(String name, int age){
        setName(name);
        setAge(age);
    }
    public void setAge(int age){
        this.age=age;
    }
    public int getAge() {return age;}
    public String getName(){return name;}
    public void setName(String name){
        this.name=name;
    }

    @Override
    public String toString(){
        return this.name+" - "+this.age;
    }

}
