package Lectures.Generics.ListUtilities_04;

import java.util.*;

public class Main {
    public static void main(String[] args) {
        List<Integer> numbers=List.of(12,2,2,1);
        System.out.println(ListUtils.getMin(numbers));
        System.out.println(ListUtils.getMax(numbers));
    }
}
