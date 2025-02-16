package Excercises.SetsAndDictionaries;

import java.util.*;

public class UniqueUsernames_01 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        int n=Integer.parseInt(s.nextLine());
        Set<String> usernames=new LinkedHashSet<>();

        for(int i=0;i<n;i++){
            String username=s.nextLine();
            usernames.add(username);
        }

        for(String user:usernames){
            System.out.println(user);
        }
    }
}
