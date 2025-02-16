package Excercises.StackAndQueue;

import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class PoisonousPlants_09 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        int n = s.nextInt();
        List<Integer> plants = new ArrayList<>();
        ArrayDeque<Integer> indexStack = new ArrayDeque<>();

        for (int i = 0; i < n; i++) {
            plants.add(i, s.nextInt());
        }


        int currentDays = 0;
        boolean anyPlantDied =true;

        while (anyPlantDied && !plants.isEmpty()) {
            anyPlantDied=false;
            for (int i = 1; i < plants.size(); i++) {
                if (plants.get(i) > plants.get(i - 1)) {
                    indexStack.push(i);
                    anyPlantDied=true;
                }
            }


            while (!indexStack.isEmpty()){
                int index = indexStack.pop();
                plants.remove(index);
            }
            if(anyPlantDied)currentDays++;
        }

       System.out.println(currentDays);


    }
}

