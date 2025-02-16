package Excercises.SetsAndDictionaries;
import java.util.*;
public class HandsOfCards {
    public static void main(String[] args)
    {
       Scanner s = new Scanner(System.in);

       Map<String, Set<String>> players=new LinkedHashMap<>();

       String input=s.nextLine();
       while(!"JOKER".equals(input)){

           //input -> "{personName}: {PT, PT, PT,… PT}"

           String name=input.split(": ")[0];
           String cards=input.split(": ")[1];
           String[] cardsArray=cards.split(", ");

           Set<String> cardsSet=new HashSet<>();
           cardsSet.addAll(Arrays.asList(cardsArray));

          if(!players.containsKey(name)){
              players.put(name, cardsSet);
          }else{
              Set<String> currentCards=players.get(name);
              currentCards.addAll(cardsSet);
              players.put(name, currentCards);
          }

           input=s.nextLine();
       }
        players.entrySet().forEach(entry -> {
            String name = entry.getKey();
            Set<String> cards = entry.getValue();

            int points = getCardsPoint(cards);
            System.out.printf("%s: %d%n", name, points);

        });


    }

    private static int getCardsPoint(Set<String> cards) {
        int points=0;

        Map<Character,Integer> symbolsValue=getSymbolValue();
        for(String card:cards){
             //2C -> 2 - power, C - type
            int currentPoints=0;
            if(card.startsWith("10")){
                char type=card.charAt(2);
                currentPoints=10*symbolsValue.get(type);
            }else {
                char power = card.charAt(0);
                char type = card.charAt(1);

                currentPoints = symbolsValue.get(power) * symbolsValue.get(type);
            }
            points+=currentPoints;
        }


        return points;
    }

    private static Map<Character, Integer> getSymbolValue() {
        Map<Character, Integer> characterValues=new HashMap<>();

        //{2, 3, 4, 5, 6, 7, 8, 9, 10, J, Q, K, A}
        //{S -> 4, H-> 3, D -> 2, C -> 1}
        characterValues.put('2',2);
        characterValues.put('3',3);
        characterValues.put('4',4);
        characterValues.put('5',5);
        characterValues.put('6',6);
        characterValues.put('7',7);
        characterValues.put('8',8);
        characterValues.put('9',9);
        characterValues.put('J',11);
        characterValues.put('Q',12);
        characterValues.put('K',13);
        characterValues.put('A',14);
        characterValues.put('S',4);
        characterValues.put('H',3);
        characterValues.put('D',2);
        characterValues.put('C',1);

        return characterValues;
    }
}
