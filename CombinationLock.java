
import java.util.Scanner;

public class CombinationLock extends Lock
{
    
    protected String combination;
    protected Scanner scan = new Scanner(System.in); 
    
    public CombinationLock()
    {
        super();
        combination = "";
    }
    public CombinationLock(String combo)
    {
        super();
        combination = combo;
    }
    public void open()
    {
        System.out.print("Enter the combination :: ");
        String combo = scan.nextLine();
        if(combo.equals(combination))
        {
            super.open();
        }
    }
    public void setCombination(String combo)
    {
        combination = combo;
    }
    public String getCombination()
    {
        return combination;
    }
    public String toString()
    {
        return super.toString() + " Combinaion is : " + getCombination();
    }
}
