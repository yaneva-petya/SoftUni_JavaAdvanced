package Excercises.SetsAndDictionaries;

import java.util.*;

public class PeriodicTable_03 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        int n=Integer.parseInt(s.nextLine());
        Set<String> compounds=new TreeSet<>();

        for(int i=0;i<n;i++){
            String[] line=s.nextLine().split("\\s+");
            compounds.addAll(Arrays.asList(line));
        }

        for(String el:compounds){System.out.print(el+" ");}
    }
}
