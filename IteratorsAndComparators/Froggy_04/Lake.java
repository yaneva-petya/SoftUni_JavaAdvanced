package Excercises.IteratorsAndComparators.Problems.Froggy_04;

import java.util.*;


public class Lake implements Iterable<Integer>{

    private List<Integer> numbers;
    public Lake(List<Integer> numbers){
        this.numbers=numbers;
    }

    @Override
    public Iterator<Integer> iterator() {
        return new Iterator<Integer>() {

            private int evenIndex=0;
            private int oddIndex=1;

            @Override
            public boolean hasNext() {
                return evenIndex<numbers.size() || oddIndex<numbers.size();
            }

            @Override
            public Integer next() {
               int number;
               if(evenIndex<numbers.size()){
                   number=numbers.get(evenIndex);
                   evenIndex+=2;
               }else {
                   number=numbers.get(oddIndex);
                  oddIndex+=2;
               }
               return number;
            }
        };
    }
}
