package Excercises.SetsAndDictionaries;
import java.util.*;

public class SetsOfElements_02 {
    public static void main(String[] args) {

        Scanner s = new Scanner(System.in);
        String[] input = s.nextLine().split("\\s+");
        int firstLength = Integer.parseInt(input[0]);
        int secondLength = Integer.parseInt(input[1]);

        Set<Integer> first = new LinkedHashSet<>(firstLength);
        Set<Integer> second = new LinkedHashSet<>(secondLength);

        for (int i = 0; i <firstLength;i++) {
            first.add(Integer.parseInt(s.nextLine()));
        }
        for (int i = 0; i <secondLength;i++) {
            second.add(Integer.parseInt(s.nextLine()));
        }


        for (int number : first){
            if(second.contains(number)){
                System.out.print(number + " ");
            }
        }
    }


}
