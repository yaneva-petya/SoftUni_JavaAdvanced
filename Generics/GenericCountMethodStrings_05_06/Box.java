package Excercises.Generics.GenericCountMethodStrings_05_06;

import java.util.ArrayList;
import java.util.List;

public class Box<T extends Comparable<T>> {
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
    public int countCounterElements(T elementToCompare){
        int count=0;
        for (T element:elements){
            int result=element.compareTo(elementToCompare);
            //0->equals elements
            //1->the second element is bigger than the first
            //-1->the first element is bigger than the second

            if(result > 0){
                count+=1;
            }
        }

        return count;
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