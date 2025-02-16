package Excercises.SetsAndDictionaries;
import java.util.*;
public class CountSymbols_04 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        String input=s.nextLine();
        TreeMap<Character,Integer> characters=new TreeMap<>();

        for(int i=0;i<input.length();i++){
            char currentChar=input.charAt(i);
            characters.putIfAbsent(currentChar,0);

            characters.put(currentChar,characters.get(currentChar)+1);
        }

        characters.entrySet().forEach(element -> System.out.printf("%c: %d time/s%n", element.getKey(), element.getValue()));
    }
}
