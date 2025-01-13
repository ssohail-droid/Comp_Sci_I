public class FahrenheitToCelsius
{
    public void fTocV(double operand1)
    {
        double subt = operand1 - 32.0;
        double dive = 5.0 / 9.0;
        double celsius = subt * dive;
        System.out.println("void Method :: ");
        System.out.println(operand1 + " degrees Fahrenheit == " + celsius + " degrees Celsius");
        
    }
    public double fTocR(double operand1)
    {
        double sub = operand1 - 32.0;
        double div = 5.0 / 9.0;
        double celsius = sub * div;
        return celsius;
    }
}
