import java.util.Scanner;

public class FahrenheitToCelsiusRunner
{
    public static void main (String argss[])
    {
        Scanner key = new Scanner (System.in);
        FahrenheitToCelsius octothorp = new FahrenheitToCelsius();
        
        System.out.print("Fahrenheit :: ");
        double fahrenheit = key.nextDouble();
    
        octothorp.fTocV(fahrenheit);
         
        System.out.println("Return Method :: ");
        System.out.println(fahrenheit + " degrees Fahrenheit == " + octothorp.fTocR(fahrenheit) + " degrees Celsius");
    }
}
