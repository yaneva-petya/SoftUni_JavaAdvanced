package Lectures.SetsAndDictionaries.Problems;

import java.util.*;

public class CountRealNumbers_04 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        Map<Double, Integer> realNumbers=new LinkedHashMap<>();

        double[] values=Arrays.stream(s.nextLine().split("\\s+"))
                .mapToDouble(Double::parseDouble).toArray();

        for(double value:values){
           /* if(realNumbers.containsKey(value)){
                int currentValue=realNumbers.get(value);
                realNumbers.put(value,currentValue+1);
            }else {
                realNumbers.put(value,1);
            }*/

            realNumbers.putIfAbsent(value,0);
            realNumbers.put(value,realNumbers.get(value)+1);
        }

        /*for(Map.Entry<Double, Integer> entry: realNumbers.entrySet()){
            System.out.println(entry.getKey()+" -> "+entry.getValue());
        }*/
        realNumbers.forEach((k,v)->System.out.printf("%.1f -> %d\n",k,v));
    }
}
