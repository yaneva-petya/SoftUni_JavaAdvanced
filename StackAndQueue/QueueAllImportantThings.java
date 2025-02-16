package Lectures.StackAndQueue.Demo;

import java.util.ArrayDeque;
import java.util.Comparator;
import java.util.Scanner;

public class QueueAllImportantThings {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        //Queue - FIFI -First In First Out

        //offer(element) - add element at the end of the queue -> returns false if the queue is full
        //add(element) - throws exception if the queue is full

        //poll() - remove first element of the queue -> returns false if the queue is empty
        //remove() - throws exception if the queue is empty

        //peek() - get  first element of the queue

        //We can initialize the capacity of the queue (firstly, the default capacity is 16 elements)

        ArrayDeque<Integer> queue=new ArrayDeque<Integer>();

        for(int i=1;i<=5;i++){
            queue.offer(i);
        }


        //Integer[] array= (Integer[]) queue.toArray();
        Integer[] toArr=new Integer[10];
        queue.toArray(toArr);

        System.out.println("Removed element: "+queue.poll());

        System.out.println("Queue elements:");
        queue.forEach(n->System.out.println(n));
        while(!queue.isEmpty()){
           queue.poll();
        }
       System.out.println("First element: "+queue.peek());

        //PRIORITY QUEUE
        /*PriorityQueue<Integer> priorityQueue =new PriorityQueue<>(Comparator.reverseOrder());//descending order with Comparator

        priorityQueue.offer(15);
        priorityQueue.offer(8);
        priorityQueue.offer(-9);
        priorityQueue.offer(49);
        priorityQueue.offer(30);

        while (!priorityQueue.isEmpty()){
            System.out.println(priorityQueue.poll());
        }*/
    }
}
