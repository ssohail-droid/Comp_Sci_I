import java.util.Scanner;

public class ExamScores
{
    public static void main (String args[])
    {
        Scanner bang = new Scanner(System.in);
        int grade = 0;
        int gradeCount = 0;
        int aNUM = 0;
        int bNUM = 0;
        int cNUM = 0;
        int dNUM = 0;
        int fNUM = 0;

        System.out.println("To stop entering in grades, please enter '-1'.\n\n");
        while(grade >= 0 )
        {
            System.out.print("Enter grade " + (gradeCount +1) + ": ");
            grade = bang.nextInt();
            gradeCount++;
            if(grade >= 90)
            {
                aNUM++;
            }
            else if(grade >= 80)
            {
                bNUM++;
            }
            else if(grade >= 70)
            {
                cNUM++;
            }
            else if(grade >= 60)
            {
                dNUM++;
            }
            else if(grade < 60)
            {
                if(grade > -1)
                {
                    fNUM++;
                }
            }
        }


        System.out.println("\n\n============================");
        System.out.println("       Summary Report");
        System.out.println("============================");
        System.out.println("Total number of grades = " + (gradeCount -1));
        System.out.println("Number of A's = " + aNUM);
        System.out.println("Number of B's = " + bNUM);
        System.out.println("Number of C's = " + cNUM);
        System.out.println("Number of D's = " + dNUM);
        System.out.println("Number of F's = " + fNUM);
    }
}

