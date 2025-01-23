import java.util.Scanner;

public class GradeConverter {

    public static String getLetterGrade(int numericalGrade) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter First Integer--> ");
        int numericalGrade = scanner.nextInt();

        if (numericalGrade >= 97 && numericalGrade <= 100) {
            return "A+";
        } else if (numericalGrade >= 94 && numericalGrade <= 96) {
            return "A";
        } else if (numericalGrade >= 90 && numericalGrade <= 93) {
            return "A-";
        } else if (numericalGrade >= 87 && numericalGrade <= 89) {
            return "B+";
        } else if (numericalGrade >= 84 && numericalGrade <= 86) {
            return "B";
        } else if (numericalGrade >= 80 && numericalGrade <= 83) {
            return "B-";
        } else if (numericalGrade >= 77 && numericalGrade <= 79) {
            return "C+";
        } else if (numericalGrade >= 74 && numericalGrade <= 76) {
            return "C";
        } else if (numericalGrade >= 70 && numericalGrade <= 73) {
            return "C-";
        } else {
            return "F";
        }
        scanner.close();
    }
}
