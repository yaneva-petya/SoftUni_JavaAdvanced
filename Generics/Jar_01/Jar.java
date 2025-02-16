package Lectures.Generics.Jar_01;

import java.util.ArrayDeque;
import java.util.Deque;

public class Jar<T> {
    private Deque<T> element;

    public Jar(){
        this.element=new ArrayDeque<>();
    }

    public void add(T newElement){
        this.element.push(newElement);
    }
    public T remove(){
        return this.element.pop();
    }
}
