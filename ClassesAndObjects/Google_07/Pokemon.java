package Excercises.ClassesAndObjects.Google_07;


public class Pokemon {
    private String pokemonName;
    private String pokemonType;

    public Pokemon(String pokemonName, String pokemonType){
        setPokemonName(pokemonName);
        setPokemonType(pokemonType);
    }

    /*public Pokemon(){
        this.pokemonName="";
        this.pokemonType="";
    }*/
    public String getPokemonName() {
        return pokemonName;
    }

    public void setPokemonName(String pokemonName) {
        this.pokemonName = pokemonName;
    }



    public String getPokemonType() {
        return pokemonType;
    }

    public void setPokemonType(String pokemonType) {
        this.pokemonType = pokemonType;
    }

@Override
    public String toString(){
        return pokemonName+" "+pokemonType;
}

}
