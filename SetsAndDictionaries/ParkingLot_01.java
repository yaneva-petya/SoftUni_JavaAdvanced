package Lectures.SetsAndDictionaries.Problems;

import java.util.*;

public class ParkingLot_01 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

       Set<String> carNumbers=new LinkedHashSet<>();
      // HashMap<String, String> mapParking=new LinkedHashMap<>();
        String input=s.nextLine();
        while (!"END".equals(input)){
            String[] data=input.split(", ");
            String command=data[0];
            String number=data[1];
            switch (command){
                case "IN":
                    carNumbers.add(number);
                  //  mapParking.put(number,null);
                    break;
                case "OUT":
                    carNumbers.remove(number);
                   // mapParking.remove(number,null);
                    break;

            }

            input=s.nextLine();
        }

        if(carNumbers.isEmpty()) System.out.println("Parking Lot is Empty");
        else {
            for(String car:carNumbers){
                System.out.println(car);
            }
           // carNumbers.forEach(System.out::println);
           // mapParking.forEach((k,v)->System.out.println(k));
        }

    }
}
