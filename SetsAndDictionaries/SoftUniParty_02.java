package Lectures.SetsAndDictionaries.Problems;

import java.util.*;

public class SoftUniParty_02 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        Set<String> VIP=new TreeSet<>();
        Set<String> regular=new TreeSet<>();
        String input=s.nextLine();
        while (!input.equals("PARTY")){
            char firstSymbol=input.charAt(0);
            if(Character.isDigit(firstSymbol)){
                VIP.add(input);
            }
            else regular.add(input);
            input=s.nextLine();

        }

        input=s.nextLine();
        while (!input.equals("END")){
           VIP.remove(input);
           regular.remove(input);
           input=s.nextLine();
        }

        System.out.println(VIP.size()+regular.size());
        VIP.forEach(System.out::println);
        regular.forEach(System.out::println);





    }
}