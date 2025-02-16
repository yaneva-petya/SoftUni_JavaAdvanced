package Excercises.SetsAndDictionaries;
import java.util.*;
public class PopulationCounter_09 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
//          country     city    population
        Map<String, Map<String, Integer>> population=new TreeMap<>();

        String input=s.nextLine();
        while (!"report".equals(input)){
            String city=input.split("\\|")[0];
            String country=input.split("\\|")[1];
            int count=Integer.parseInt(input.split("\\|")[2]) ;

            if(!population.containsKey(country)){
                population.put(country, new LinkedHashMap<>(){
                            {
                               put(city, count);

                            }
                });
            }else{
                Map<String,Integer> currentCity=population.get(country);
                if(!currentCity.containsKey(city)){
                   currentCity.put(city,count);

                }

            }

            input=s.nextLine();
        }
//        UK (total population: 4)=>London: 4
//        Bulgaria (total population: 3)=>Veliko Tarnovo: 2=>Sofia: 1
//        Italy (total population: 3)=>Rome: 3

        population.entrySet().stream().sorted((e1, e2) -> {
            long total1 = e2.getValue().values().stream().reduce((m1, m2) -> m1 + m2).get();
            long total2 = e1.getValue().values().stream().reduce((m1, m2) -> m1 + m2).get();
            return Long.compare(total1, total2);
        }).forEach(e -> {
            System.out.println(e.getKey() + " (total population: " + e.getValue()
                    .values().stream().reduce((m1,m2) -> m1 + m2).get() + ")");
            e.getValue().entrySet().stream().sorted((e1,e2) -> e2.getValue().compareTo(e1.getValue()))
                    .forEach(city -> {
                        System.out.printf("=>%s: %d%n",city.getKey(),city.getValue());
                    });
        });
    }

}
