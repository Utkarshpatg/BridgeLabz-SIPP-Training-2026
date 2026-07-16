import java.util.Scanner;

public class StudentGradeCalculator {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.print("Enter Physics Marks: ");
        double physicsMarks = input.nextDouble();

        System.out.print("Enter Chemistry Marks: ");
        double chemistryMarks = input.nextDouble();

        System.out.print("Enter Maths Marks: ");
        double mathsMarks = input.nextDouble();

        double totalMarks = physicsMarks + chemistryMarks + mathsMarks;
        double percentage = totalMarks / 3;

        char grade;
        String remarks;

        if (percentage >= 80) {
            grade = 'A';
            remarks = "Level 4, above agency-normalized standards";
        }
        else if (percentage >= 70) {
            grade = 'B';
            remarks = "Level 3, at agency-normalized standards";
        }
        else if (percentage >= 60) {
            grade = 'C';
            remarks = "Level 2, below but approaching agency-normalized standards";
        }
        else if (percentage >= 50) {
            grade = 'D';
            remarks = "Level 1, well below agency-normalized standards";
        }
        else if (percentage >= 40) {
            grade = 'E';
            remarks = "Level 1-, too below agency-normalized standards";
        }
        else {
            grade = 'R';
            remarks = "Remedial standards";
        }

        System.out.println("\n----- Student Result -----");
        System.out.println("Physics Marks : " + physicsMarks);
        System.out.println("Chemistry Marks : " + chemistryMarks);
        System.out.println("Maths Marks : " + mathsMarks);
        System.out.println("Average Percentage : " + percentage + "%");
        System.out.println("Grade : " + grade);
        System.out.println("Remarks : " + remarks);
    }
}