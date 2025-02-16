package Excercises.FunctionaProgramming.Problems;

import java.util.*;
import java.util.function.BiFunction;

public class ListOfPredicates_09 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        int n=Integer.parseInt(s.nextLine());

        List<Integer> dividers=Arrays.stream(s.nextLine().split("\\s+"))
                .map(Integer::parseInt).toList();

        BiFunction<Integer, List<Integer>, Boolean> isDivided=(
                (num, list)->
                {
                    for (int numInList:list){
                        if(num%numInList!=0){
                            return false;
                        }
                    }
                    return true;
                });

       for(int i=1;i<=n;i++){
           if(isDivided.apply(i,dividers)){
               System.out.print(i+" ");
           }
       }
    }
}
