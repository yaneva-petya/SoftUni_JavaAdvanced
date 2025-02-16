package Excercises.SetsAndDictionaries;

import java.util.*;

public class FixEmails_06 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        LinkedHashMap<String, String> emails=new LinkedHashMap<>();
        String command=s.nextLine();
        String email="";

        while (!command.equals("stop")){
            email=s.nextLine();
            if(!email.endsWith("uk") && !email.endsWith("us") && !email.endsWith("com")){
                emails.put(command, email);
            }

            command=s.nextLine();
        }


        emails.forEach((k,v)->System.out.printf("%s -> %s\n", k,v));
    }
}
