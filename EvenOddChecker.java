import java.util.Scanner;

public class EvenOddChecker {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter number: ");
        int number = scanner.nextInt();
        if (number % 2 == 0) {
            System.out.println(number + " is an even number");
        }

        if (number % 2 == 1) {
            System.out.println(number + " is an odd number");
        }


        scanner.close();
    }
}
