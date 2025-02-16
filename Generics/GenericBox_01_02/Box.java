package Excercises.Generics.GenericBox_01_02;

import java.util.ArrayList;
import java.util.List;

public class Box<T> {
    private List<T> values;

    public Box(){
        this.values=new ArrayList<>();
    }

    public void addValues(T value){
        this.values.add(value);
    }

    @Override
    public String toString() {

        StringBuilder builder = new StringBuilder();

        for (T element: this.values){
            String stringToAppend = String.format("%s: %d", element.getClass().getName(), element);
            builder.append(stringToAppend).append(System.lineSeparator());

        }

        return builder.toString();
    }






}
