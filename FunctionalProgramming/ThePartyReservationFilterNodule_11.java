package Excercises.FunctionaProgramming.Problems;

import java.util.*;
import java.util.function.Predicate;
import java.util.stream.Collectors;

public class ThePartyReservationFilterNodule_11 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        List<String> guests = Arrays.stream(s.nextLine().split("\\s+"))
                .collect(Collectors.toList());

        Map<String, Predicate<String>> filterModule=new HashMap<>();

        String input=s.nextLine();
        while (!"Print".equals(input)){
            String command=input.split(";")[0];
            String chosenOne=input.split(";")[2];
            String key=input.split(";")[1].concat(chosenOne);

            if(command.startsWith("Add")){
                Predicate<String> add=null;

                if(key.startsWith("Starts")){
                    add=x->!x.startsWith(chosenOne);
                }else if(key.startsWith("Ends")){
                    add=x->x.endsWith(chosenOne);
                }else if(key.startsWith("Length")){
                    int currentLength=Integer.parseInt(chosenOne);
                    add=x->x.length()!=currentLength;
                }else if(key.startsWith("Contains")){
                    add=x->!x.contains(chosenOne);
                }

                filterModule.putIfAbsent(key,add);
            }else {
                filterModule.remove(key);
            }

            input=s.nextLine();
        }
        for(var filters: filterModule.entrySet()){
            guests=guests.stream().filter(filters.getValue()).collect(Collectors.toList());
        }
        System.out.println(String.join(", ",guests));
    }
}
