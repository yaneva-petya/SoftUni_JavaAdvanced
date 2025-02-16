package Lectures.StackAndQueue.Programs.Queue;

import java.util.ArrayDeque;
import java.util.Scanner;

public class PrinterQueue_05 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        ArrayDeque<String> queue=new ArrayDeque<>();
        String input=s.nextLine();

        while(!"print".equals(input)) {
            if (!"cancel".equals(input)) {
                queue.offer(input);}
            else{
                if (!queue.isEmpty()) {
                    String doc = queue.poll();
                    System.out.println("Canceled " + doc);
                } else {
                    System.out.println("Printer is on standby");
                }
            }

            input = s.nextLine();
        }

       for(String docs: queue){
           System.out.println(queue.poll());
       }
    }
}
