package Lectures.Generics.Jar_01;

import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        Jar<Integer> jar=new Jar<>();
        jar.add(15);
        jar.add(45);
        jar.add(78);
        System.out.println(jar.remove());
    }
}
