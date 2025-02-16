package Excercises.SetsAndDictionaries;
import java.util.*;
public class Phonebook_05 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        LinkedHashMap<String,String> contacts=new LinkedHashMap<>();

        String input=s.nextLine();
        while (!"search".equals(input)){
            String[]data=input.split("\\-");
            String name=data[0];
            String num=data[1];

            if(contacts.containsKey(name)){
                contacts.put(name, num);
            }
            else{
                contacts.put(name, num);
            }


            input=s.nextLine();
        }

        input=s.nextLine();
        while (!"stop".equals(input)){
            if(contacts.containsKey(input)){
                System.out.printf("%s -> %s\n", input,contacts.get(input));}
            else System.out.printf("Contact %s does not exist.\n", input);
            input=s.nextLine();
        }
    }
}
