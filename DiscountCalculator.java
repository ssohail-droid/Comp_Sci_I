import java.util.Scanner;

public class DiscountCalculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        
        System.out.print("Enter the bill amount: ");
        double bill = scanner.nextDouble();

        
        double finalAmount = bill;

        
        if (bill > 2000) 
        {
            double discount = bill * 0.15;  
            finalAmount = bill - discount;
            System.out.println("You received a 15% discount.");
        }

        
        System.out.println("The final amount to be paid is: $" + finalAmount);

         
        scanner.close();
    }
}
