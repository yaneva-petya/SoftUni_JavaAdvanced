package Lectures.IteratorsAndCmparators.Problem.Book;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Book implements Comparable<Book>{
    private String title;
    private int year;
    private List<String> authors;

    public Book(String title, int year,String...authors){
        this.title=title;
        this.year=year;
        this.authors=new ArrayList<>();
        setAuthors(authors);
    }

    private void setTitle(String title){
        this.title=title;
    }
    private void setYear(int year){this.year=year;}
    private void setAuthors(String...authors){
        this.authors.addAll(Arrays.asList(authors));
    }
    public String getTitle(){return this.title;}
    public int getYear(){return this.year;}
    public List<String> getAuthors(){return this.authors;}

    @Override
    public String toString() {
        return "Lectures.IteratorsAndCmparators.Problem.Book{" +
                "title='" + title + '\'' +
                ", year=" + year +
                ", authors=" + authors +
                '}';
    }

    @Override
    public int compareTo(Book book) {
        int result=this.getTitle().compareTo(book.getTitle());
        if(result==0){
            result=Integer.compare(this.getYear(), book.getYear());
        }
        return result;
    }
}
