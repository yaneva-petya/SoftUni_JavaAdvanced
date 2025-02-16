package Excercises.ClassesAndObjects.Google_07;

import java.util.*;

public class Main {
    public static void main(String[] args) {

        Scanner s = new Scanner(System.in);
        String input=s.nextLine();
        HashMap<String, Person> people=new HashMap<>();

        while (!"End".equals(input)){
            String[] tokens=input.split("\\s+");

            String name=tokens[0];
            String command=tokens[1];

            if(!people.containsKey(name))
            {
                people.put(name, new Person(name));
            }
            switch (command){
                case "company":{
                    people.get(name).setCompany(new Company(tokens[2], tokens[3], Double.parseDouble(tokens[4])));
                    //Company company=initCompany(Arrays.asList(tokens).subList(2,5));
                    //people.get(name).setCompany(company);
                    break;
                }
                case "pokemon":{
                   people.get(name).addPokemon(new Pokemon(tokens[2],tokens[3]));
                   break;
                }
                case "parents":{
                    people.get(name).addParents(new Parents(tokens[2],tokens[3]));
                    break;
                }
                case "children":{
                    people.get(name).addChildren(new Children(tokens[2],tokens[3]));
                    break;
                }
                case "car":{
                    people.get(name).setCar(new Car(tokens[2], Integer.parseInt(tokens[3])));
                break;
                }
            }

            input=s.nextLine();
        }
        String searchingFor=s.nextLine();
        System.out.println(people.get(searchingFor).toString());
    }

    private static Company initCompany(List<String> data) {
        return new Company(data.get(0),data.get(1),
                Double.parseDouble(data.get(2)));
    }
}
