public class Hand {
    private Card[] cards;
    private int cardCount;

    public Hand() {
        cards = new Card[11];
        cardCount = 0;
    }

    public void addCard(Card card) {
        if (cardCount < cards.length) {
            cards[cardCount++] = card;
        }
    }

    public int getTotalValue() {
        int total = 0;
        for (int i = 0; i < cardCount; i++) {
            total += cards[i].getValue();
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
