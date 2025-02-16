package Excercises.ClassesAndObjects.Google_07;

import java.util.ArrayList;
import java.util.List;

public class Person {
    private String namePerson;
    private Company company;
    private Car car;
    private List<Parents> parents;
    private List<Children> children;
    private List<Pokemon> pokemon;

    public Person(String name){
        this.namePerson=name;
        setCompany(new Company());
        setCar(new Car());
        this.parents=new ArrayList<>();
        this.children=new ArrayList<>();
        this.pokemon=new ArrayList<>();
    }

    public void addParents(Parents parent){
        this.parents.add(parent);
    }
    public void addChildren(Children child){
        this.children.add(child);
    }
    public void addPokemon(Pokemon pokemon){
        this.pokemon.add(pokemon);
    }

    @Override
    public String toString(){
      StringBuilder sb=new StringBuilder(this.namePerson);
      sb.append(System.lineSeparator())
              .append(company.toString()).append(System.lineSeparator())
              .append(car.toString()).append(System.lineSeparator());

      sb.append("Pokemon:").append(System.lineSeparator());
      for(Pokemon pokemon:pokemon){
          sb.append(pokemon.toString()).append(System.lineSeparator());
      }
      sb.append("Parents:").append(System.lineSeparator());
      for(Parents parent:parents){
          sb.append(parent.toString()).append(System.lineSeparator());
      }

      sb.append("Children:").append(System.lineSeparator());
      for(Children child:children){
          sb.append(child.toString()).append(System.lineSeparator());
      }
      return sb.toString();
    }




    public Company getCompany() {
        return company;
    }

    public void setCompany(Company company) {
        this.company = company;
    }


    public Car getCar() {
        return car;
    }

    public void setCar(Car car) {
        this.car = car;
    }

    public List<Parents> getParents() {
        return parents;
    }

    public void setParents(List<Parents> parents) {
        this.parents = parents;
    }

    public List<Children> getChildren() {
        return children;
    }

    public void setChildren(List<Children> children) {
        this.children = children;
    }

    public List<Pokemon> getPokemon() {
        return pokemon;
    }

    public void setPokemon(List<Pokemon> pokemon) {
        this.pokemon = pokemon;
    }




    public String getNamePerson() {
        return namePerson;
    }

    public void setNamePerson(String namePerson) {
        this.namePerson = namePerson;
    }

}
