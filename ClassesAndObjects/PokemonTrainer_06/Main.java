package Excercises.ClassesAndObjects.PokemonTrainer_06;
import java.util.*;
public class Main {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        String input = s.nextLine();

        Map<String, List<Pokemon>> mapPokemon = new LinkedHashMap<>();
        Map<String, Integer> trainerBadges = new LinkedHashMap<>();

        while (!input.equals("Tournament")) {
            String[] inputData = input.split("\\s+");
            String nameTrainer = inputData[0];
            String namePokemon = inputData[1];
            String pokemonElement = inputData[2];
            int healthPokemon = Integer.parseInt(inputData[3]);

            // Only insert into trainerBadges if not already present
            trainerBadges.putIfAbsent(nameTrainer, 0);

            Pokemon pokemon = new Pokemon(namePokemon, pokemonElement, healthPokemon);

            mapPokemon.putIfAbsent(nameTrainer, new ArrayList<>());
            mapPokemon.get(nameTrainer).add(pokemon);

            input = s.nextLine();
        }

        String command = s.nextLine();
        while (!"End".equals(command)) {
            String currentCommand = command;

            mapPokemon.entrySet().forEach(trainer -> {
                List<Pokemon> pok = trainer.getValue();
                Iterator<Pokemon> iterator = pok.iterator();
                while (iterator.hasNext()) {
                    Pokemon pokemon = iterator.next();
                    if (pokemon.getElement().equals(currentCommand)) {
                        // Increase badges if element matches
                        int currentBadges = trainerBadges.get(trainer.getKey());
                        trainerBadges.put(trainer.getKey(), currentBadges + 1);
                        break;
                    } else {
                        pokemon.setHealth(pokemon.getHealth() - 10);
                        if (pokemon.getHealth() <= 0) {
                            iterator.remove();
                            break;
                        }
                    }
                }
            });

            command = s.nextLine();
        }

        // Final output
        trainerBadges.entrySet().stream().sorted((a,b)->{
            return b.getValue().compareTo(a.getValue());
        }).forEach(entry -> {
            System.out.printf("%s %d %d\n", entry.getKey(), entry.getValue(), mapPokemon.get(entry.getKey()).size());
        });
    }
}