package Excercises.ClassesAndObjects.PokemonTrainer_06;

import java.util.List;

public class Trainer {
    private String name;
    private int badges;
    private List<Pokemon> pokemon;

    public Trainer(String name, int badges, List<Pokemon> pokemon){
        setName(name);
        setBadges(badges);
        setPokemon(pokemon);
    }
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }


    public int getBadges() {
        return badges;
    }

    public void setBadges(int badges) {
        this.badges = badges;
    }


    public List<Pokemon> getPokemon() {
        return pokemon;
    }

    public void setPokemon(List<Pokemon> pokemon) {
        this.pokemon = pokemon;
    }




}
