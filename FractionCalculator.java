import java.util.Scanner;

public class FractionCalculator {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

       
        System.out.print("Enter a fraction arithmetic problem (e.g., 2/3 + 1/2): ");
        String input = scanner.nextLine();

        
        String[] parts = input.split(" ");
        String fraction1 = parts[0];
        String operator = parts[1];
        String fraction2 = parts[2];

        
        int num1 = Integer.parseInt(fraction1.split("/")[0]);
        int denom1 = Integer.parseInt(fraction1.split("/")[1]);
        int num2 = Integer.parseInt(fraction2.split("/")[0]);
        int denom2 = Integer.parseInt(fraction2.split("/")[1]);

        
        int resultNum = 0;
        int resultDenom = 0;

        if (operator.equals("+")) {
            
            resultNum = num1 * denom2 + num2 * denom1;
            resultDenom = denom1 * denom2;
        } else if (operator.equals("-")) {
            
            resultNum = num1 * denom2 - num2 * denom1;
            resultDenom = denom1 * denom2;
        } else if (operator.equals("*")) {
          
            resultNum = num1 * num2;
            resultDenom = denom1 * denom2;
        } else if (operator.equals("/")) {
            
            resultNum = num1 * denom2;
            resultDenom = denom1 * num2;
        } else {
           
            System.out.println("Invalid operator.");
            scanner.close();
            return;
        }

       
        int a = Math.abs(resultNum);
        int b = Math.abs(resultDenom);
        while (b != 0) {
            int temp = b;
            b = a % b;
            a = temp;
        }
        int gcd = a; 

        resultNum /= gcd;
        resultDenom /= gcd;

       
        System.out.println("Result: " + resultNum + "/" + resultDenom);

       
        scanner.close();
    }
}
