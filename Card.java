public class Card {
    private String face;
    private int value;

    public Card(String face, int value) {
        this.face = face;
        this.value = value;
    }

    public String getFace() {
        return face;
    }

    public int getValue() {
        return value;
    }

    public String toString() {
        return face + " (" + value + ")";
    }
}
