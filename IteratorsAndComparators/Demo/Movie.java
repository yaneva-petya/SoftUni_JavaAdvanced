package Excercises.IteratorsAndComparators.Demo;

public class Movie implements Comparable<Movie> {
    private String name;
    private Double budget;
    private Double rating;

    public Movie(String name, Double budget, Double rating) {
        this.name = name;
        this.budget=budget;
        this.rating=rating;

    }


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Double getBudget() {
        return budget;
    }

    public void setBudget(Double budget) {
        this.budget = budget;
    }



    public Double getRating() {
        return rating;
    }

    public void setRating(double rating) {
        this.rating = rating;
    }

    @Override
    public String toString() {
        return "Movie{" +
                "name='" + name + '\'' +
                ", budget=" + budget +
                ", rating=" + rating +
                '}';
    }

    @Override
    public int compareTo(Movie otherMovie) {
        return Double.compare(this.rating,otherMovie.rating);
    }
}
