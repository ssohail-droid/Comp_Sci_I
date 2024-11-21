import java.util.Scanner;

public class AssignmentManager {
    public static void main(String[] args) {
        
        Assignment defaultAssignment = new Assignment();
        displayAssignmentInfo(defaultAssignment);

        
        Assignment testAssignment1 = new Assignment("Chapter 1 Test", "Test", 95);
        displayAssignmentInfo(testAssignment1);

        Assignment testAssignment2 = new Assignment("Chapter 1 Quiz", "Quiz", 83);
        displayAssignmentInfo(testAssignment2);

        testAssignment1.setScore(75);
        displayAssignmentInfo(testAssignment1);
        testAssignment2.setScore(30);
        displayAssignmentInfo(testAssignment2);
    }

    
    public static void displayAssignmentInfo(Assignment assignment) {
        System.out.println("Type         : " + assignment.getType());
        System.out.println("Name         : " + assignment.getName());
        System.out.println("Score        : " + assignment.getScore());
        System.out.println("Letter Grade : " + assignment.getLetterGrade());
        System.out.println();
    }
}
