
public class Appointment extends Date {
    private String text;
    public Appointment(int m, int d, int y, String t) {
        super(m, d, y);
        text = t;
    }
    public String getText() {
        return text;
    }
    
    public String toString() {
        return super.toString() + " " + text;
    }
}
