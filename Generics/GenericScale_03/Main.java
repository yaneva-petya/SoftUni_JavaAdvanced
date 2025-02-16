package Lectures.Generics.GenericScale_03;

import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        Scale<Integer> scale1=new Scale<>(2,1);
        System.out.println(scale1.getHeavier());
    }
}
