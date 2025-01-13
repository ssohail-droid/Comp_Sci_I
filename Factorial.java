import java.util.Scanner;

public class Factorial
{
    public static void main (String[] args)
    {
        Scanner key = new Scanner (System.in);
        System.out.print("Please enter the number:: ");
        int number = key.nextInt();// enter number 
        int i = 1;// 
        int facti = 1;
        for(i=1; i <= number; i++)
        {
            facti = facti * i;
        }
        System.out.println("int = factorial of "+number+" is "+facti);
        long iL = 1L;
        long factL = 1L;
        for(iL=1; iL <= number; iL++)
        {
            factL = factL * iL;// the math parte
        }
        System.out.println("factorial of "+number+" is "+factL);
        double iD = 1;
        double factD = 1;
        for(iL=1; iD <= number; iD++)
        {
            factD = factD * iD;
        }
        System.out.println("factorial of "+number+" is "+factD);
    }
}
