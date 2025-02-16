package Lectures.SetsAndDictionaries.Problems;

import java.util.*;

public class VoinaNumberGame_03 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        HashSet<Integer> player1 = new HashSet<>();
       HashSet<Integer> player2 = new HashSet<>();

        // Reading the first player's cards
        String[] input1 = s.nextLine().split("\\s+");
        for (String num : input1) {
            player1.add(Integer.parseInt(num));
        }

        // Reading the second player's cards
        String[] input2 = s.nextLine().split("\\s+");
        for (String num : input2) {
            player2.add(Integer.parseInt(num));
        }

        Iterator<Integer> iterator1 = player1.iterator();
        Iterator<Integer> iterator2 = player2.iterator();

        int round = 1;
        while (round <= 50 && !player1.isEmpty() && !player2.isEmpty()) {
            // Check if the players have cards to play
            if (!iterator1.hasNext() || !iterator2.hasNext()) {
                break;
            }

            // Get the top cards for both players
            Integer card1 = iterator1.next();
            Integer card2 = iterator2.next();

            iterator1.remove();
            iterator2.remove();

            if (card1 > card2) {
                player1.add(card1);
                player1.add(card2);
            } else if (card2 > card1) {
                player2.add(card1);
                player2.add(card2);
            }

            round++;
        }

        if (player1.size() <player2.size()) {
            System.out.println("Second player wins!");

        } else if (player1.size() > player2.size()) {
            System.out.println("First player wins!");
        } else {
            System.out.println("Draw!");
        }
    }
}
