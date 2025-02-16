package Excercises.Generics.GenericSwapMethodStrings_03_04;

import java.util.ArrayList;
import java.util.List;

public class Box<T> {
    private List<T> elements;

    public Box(){
        this.elements=new ArrayList<>();
    }
    public void add(T element){
        this.elements.add(element);
    }

    public void swap(int index1, int index2){
        T temp=elements.get(index1);
        elements.set(index1,elements.get(index2));
        elements.set(index2,temp);

    }

    @Override
    public String toString(){
        StringBuilder sb=new StringBuilder();
        for (T element:elements){
            String formatted=String.format("%s: %s", element.getClass().getName(), element);
            sb.append(formatted).append(System.lineSeparator());
        }
        return sb.toString();
    }
}
