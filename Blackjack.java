import java.util.Scanner;

public class Blackjack {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Hand playerHand = new Hand();
        System.out.println(" Welcome to Blackjack! ");
        boolean bust = false;
        
        while (true) {
            System.out.println(playerHand);
            System.out.print("Would you like to hit or stay? ");
            String choice = scanner.nextLine().toLowerCase();
            if (choice.equals("hit")) {
                int cardValue = (int) (Math.random() * 10) + 1;
                playerHand.addCard(cardValue);
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
}
