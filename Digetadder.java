import java.util.Scanner;

public class Digetadder
{
    public static void main (String args[])
    {
        Scanner key = new Scanner (System.in);
        System.out.print("Enter number to find the sum of :: ");
        int num1 = key.nextInt();
        int temp = num1;
        int sum = 0;
        
        while(temp > 0)
        {
            sum += temp % 10;
            temp = temp / 10;
        }
        System.out.print("\n" + sum + " is the sum of " + num1);
    }
}
