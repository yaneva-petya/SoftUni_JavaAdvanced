package Lectures.StackAndQueue.Programs.Queue;


import java.util.ArrayDeque;
import java.util.Scanner;

public class BrowserHistoryUpgrade_08 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        ArrayDeque<String> historyStack = new ArrayDeque<>();
        ArrayDeque<String> forwardStack = new ArrayDeque<>(); // To keep track of forward URLs

        String input = s.nextLine();
        while (!input.equals("Home")) {
            if (input.equals("back")) {
                if (historyStack.size() > 1) {
                    forwardStack.push(historyStack.pop()); // Push current URL to forward stack
                    System.out.println(historyStack.peek()); // Show previous URL
                } else {
                    System.out.println("no previous URLs");
                }
            } else if (input.equals("forward")) {
                if (!forwardStack.isEmpty()) {
                    String nextUrl = forwardStack.pop(); // Get the next URL to go forward
                    historyStack.push(nextUrl); // Push it to history stack
                    System.out.println(nextUrl);
                } else {
                    System.out.println("no next URLs");
                }
            } else {
                // Normal navigation
                historyStack.push(input); // Push new URL to history stack
                forwardStack.clear(); // Clear forward history as it's invalid now
                System.out.println(input);
            }

            input = s.nextLine(); // Get next input
        }




    }
}
