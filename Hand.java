public class Hand {
    private int[] cards;
    private int cardCount;

    public Hand() {
        cards = new int[11]; 
        cardCount = 0;
    }

    public void addCard(int cardValue) {
        if (cardCount < cards.length) {
            cards[cardCount++] = cardValue;
        }
    }

    public int getTotalValue() {
        int total = 0;
        for (int i = 0; i < cardCount; i++) {
            total += cards[i];
        }
        return total;
    }

    public String toString() {
        StringBuilder handDescription = new StringBuilder("Hand: ");
        for (int i = 0; i < cardCount; i++) {
            handDescription.append(cards[i]).append(" ");
        }
        return handDescription + "Total: " + getTotalValue();
    }
}
