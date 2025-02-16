package Excercises.Generics.GenericCountMethodStrings_05_06;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner s = new Scanner(System.in);
        int n =Integer.parseInt(s.nextLine());
        Box<Double> box=new Box<>();
        for(int i=0;i<n;i++){
           double input=Double.parseDouble(s.nextLine());
            box.add(input);
        }

       // String elementToCompare=s.nextLine();
        double elementToCompare=Double.parseDouble(s.nextLine());
        System.out.println(box.countCounterElements(elementToCompare));
    }
}
