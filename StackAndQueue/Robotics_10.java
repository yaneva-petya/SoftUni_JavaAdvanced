package Excercises.StackAndQueue;
import java.util.*;

public class Robotics_10 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Parse robots and their processing times
        String[] robotsInput = scanner.nextLine().split(";");
        int numRobots = robotsInput.length;

        String[] robotNames = new String[numRobots];
        int[] processTimes = new int[numRobots];
        int[] nextAvailableTime = new int[numRobots]; // When each robot will be free (in seconds)

        // Initialize robots' information
        for (int i = 0; i < numRobots; i++) {
            String[] robotDetails = robotsInput[i].split("-");
            robotNames[i] = robotDetails[0];
            processTimes[i] = Integer.parseInt(robotDetails[1]);
            nextAvailableTime[i] = 0; // All robots are initially free
        }

        // Parse start time
        String[] startTime = scanner.nextLine().split(":");
        int startHour = Integer.parseInt(startTime[0]);
        int startMinute = Integer.parseInt(startTime[1]);
        int startSecond = Integer.parseInt(startTime[2]);
        int startTimeInSeconds = startHour * 3600 + startMinute * 60 + startSecond;

        // Queue for products
        Queue<String> productQueue = new LinkedList<>();
        int currentTime = startTimeInSeconds;

        // Loop for product input
        while (true) {
            String product = scanner.nextLine();
            if (product.equals("End")) {
                break;
            }

            // Add product to the queue
            productQueue.offer(product);

            // Process products: Check each robot to see if it's free and process a product if possible
            for (int i = 0; i < numRobots; i++) {
                if (nextAvailableTime[i] <= currentTime && !productQueue.isEmpty()) {
                    String currentProduct = productQueue.poll(); // Get the next product
                    nextAvailableTime[i] = currentTime + processTimes[i]; // Update robot's next available time

                    // Log the product processing
                    int hour = (nextAvailableTime[i] / 3600) % 24;
                    int minute = (nextAvailableTime[i] / 60) % 60;
                    int second = nextAvailableTime[i] % 60;
                    System.out.printf("%s - %s [%02d:%02d:%02d]\n", robotNames[i], currentProduct, hour, minute, second);
                }
            }

            // Increase time by 1 second for the next product
            currentTime++;
        }
    }
}

