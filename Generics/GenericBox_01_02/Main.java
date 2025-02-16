package Excercises.Generics.GenericBox_01_02;

import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        /*int n=Integer.parseInt(s.nextLine());
        Box<String> box = new Box<>();
        for (int i = 1; i <= n ; i++) {
            String input = s.nextLine();
            box.addValues(input);

        }
        System.out.println(box);
    */
        int n=Integer.parseInt(s.nextLine());
        Box<Integer> box = new Box<>();
        for (int i = 1; i <= n ; i++) {
            String input = s.nextLine();
            box.addValues(Integer.valueOf(input));

        }
        System.out.println(box);
    }

}
