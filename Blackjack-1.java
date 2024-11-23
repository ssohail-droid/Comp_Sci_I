import java.util.Scanner;

public class Blackjack {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Hand playerHand = new Hand();
        System.out.println("Welcome to Blackjack!");
        boolean bust = false;
        while (true) {
            System.out.println(playerHand);
            System.out.print("Would you like to hit or stay? ");
            String choice = scanner.nextLine().toLowerCase();
            if (choice.equals("hit")) {
                Card card = dealCard();
                playerHand.addCard(card);
                System.out.println("You drew: " + card);
                if (playerHand.getTotalValue() > 21) {
                    System.out.println("Bust! You went over 21.");
                    bust = true;
                    break;
                }
            } else if (choice.equals("stay")) {
                break;
            } else {
                System.out.println("Invalid choice.");
            }
        }
        System.out.println("Final " + playerHand);
        if (bust) {
            System.out.println("You chose to stay. Game over.");
        }
    }

    private static Card dealCard() {
        String[] faces = {"Ace", "2", "3", "4", "5", "6", "7", "8", "9", "10", "Jack", "Queen", "King"};
        int[] values = {11, 2, 3, 4, 5, 6, 7, 8, 9, 10, 10, 10, 10};
        int index = (int) (Math.random() * faces.length);
        return new Card(faces[index], values[index]);
    }
}
