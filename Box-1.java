public class Box {
    private int size;

    public Box(int size) {
        this.size = size;
    }

    public void printPattern() {
        for (int i = size; i > 0; i--) {
            
            for (int j = 0; j < i; j++) {
                System.out.print("*");
            }
            
            for (int k = 0; k < size - i + 1; k++) {
                System.out.print("#");
            }
            System.out.println(); 
        }
    }
}
