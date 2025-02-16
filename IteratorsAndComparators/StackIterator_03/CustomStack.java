package Excercises.IteratorsAndComparators.Problems.StackIterator_03;

import java.util.*;

public class CustomStack implements Iterable<Integer>{
    private List<Integer> numbers;

    public CustomStack(){
        this.numbers=new ArrayList<>();
    }

    public void push(int num){
       numbers.add(num);
    }
    public int pop(){
        if(numbers.isEmpty()){
            System.out.println("No elements");
            return 0;
        }else {
            int num=numbers.get(numbers.size()-1);
           numbers.remove(numbers.size()-1);
           return num;
        }
    }

    @Override
    public Iterator<Integer> iterator() {
        return new Iterator<Integer>() {

            int index=numbers.size()-1;
            @Override
            public boolean hasNext() {
                return index>=0;
            }

            @Override
            public Integer next() {
                return numbers.get(index--);
            }
        };
    }



}
