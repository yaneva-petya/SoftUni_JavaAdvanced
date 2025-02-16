package Excercises.Generics.GenericSwapMethodStrings_03_04;

import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        /*int n=Integer.parseInt(s.nextLine());
        Box<String> box=new Box<>();
        for(int i=0;i<n;i++){
            String input=s.nextLine();
            box.add(input);
        }*/

        int n=Integer.parseInt(s.nextLine());
        Box<Integer> box=new Box<>();
        for(int i=0;i<n;i++){
            String input=s.nextLine();
            box.add(Integer.valueOf(input));
        }
        String swapIndexes=s.nextLine();
        int index1=Integer.parseInt(swapIndexes.split("\\s+")[0]);
        int index2=Integer.parseInt(swapIndexes.split("\\s+")[1]);
        box.swap(index1,index2);
        System.out.println(box);
    }

}
