package Excercises.IteratorsAndComparators.Demo;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class main {
    public static void main(String[] args) {
        //1. Varargs -> аргументът, получен в метода го третираме като масив
        // Правила за спазване при ползване на varargs :
             // 1. varargs винаги трябва да бъде последен аргумент
            // 2. В един метод можем да имаме 1 varargs
        System.out.println(printName("Ana", "Maria", "Sofia"));


        //2.Comparator and Comparable
        //2.1.Comparable -> Възмойността на даден обект да бъде сравняван с друг обект от същия клас
        Movie movie1=new Movie("Titanic", 50.00, 7.3);
        Movie movie2=new Movie("Home Alone", 40.00, 8.5);
        Movie movie3=new Movie("Stranger things", 8.00, 7.5);
        List<Movie> movies = new ArrayList<>(List.of(movie1, movie2, movie3));

        System.out.println(movie2.compareTo(movie1));

        //2.2. Comparator -> Дава възможност за разписване на външна логика за сравнение на 2 обекта
        System.out.println("My comparator:");
        Collections.sort(movies, new MovieBudgetComparator());
        movies.forEach(System.out::println);
        System.out.println("Default method sort:");
        Collections.sort(movies);//Default method
        movies.forEach(System.out::println);

    }

    public static String printName(String...name){
        StringBuilder sb=new StringBuilder();
        for(String n:name){
            sb.append(n).append(System.lineSeparator());
        }
        return sb.toString();
    }
}
