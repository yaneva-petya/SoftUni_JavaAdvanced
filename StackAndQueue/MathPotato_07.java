package Lectures.StackAndQueue.Programs.Queue;

import java.util.Arrays;
import java.util.PriorityQueue;
import java.util.Scanner;

public class MathPotato_07 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        PriorityQueue<String> kidsQueue = new PriorityQueue<>();
        Arrays.stream(s.nextLine().split("\\s+")).forEach(kidsQueue::offer);
        int n = Integer.parseInt(s.nextLine());

        int rotations = 0;


        while (kidsQueue.size() > 1) {
            rotations++;

            String firstKid = kidsQueue.poll();

            if (isPrime(rotations)) {
                System.out.println("Prime " + firstKid);
                kidsQueue.offer(firstKid);
            } else {
                System.out.println("Removed " + firstKid);
            }
        }

        System.out.println("Last is " + kidsQueue.poll());
    }

    public static Boolean isPrime(int num) {
        if (num == 1) {
            return false;
        }

        for (int i = 2; i <= Math.sqrt(num); i++) {
            if (num % i == 0) {
                return false;
            }
        }

        return true;
    }
}
