import java.util.Scanner;

public class BMI_FitnessTracker {
    public static void main(String[] args) {

        // Create Scanner object for user input
        Scanner input = new Scanner(System.in);

        // Take weight input in kilograms
        System.out.print("Enter Weight (kg): ");
        double weight = input.nextDouble();

        // Take height input in meters
        System.out.print("Enter Height (m): ");
        double height = input.nextDouble();

        // Calculate BMI using the formula
        double bmi = weight / (height * height);

        // Display BMI
        System.out.println("\nBMI = " + bmi);

        // Determine BMI category
        if (bmi < 18.5) {
            System.out.println("Category: Underweight");
        }
        else if (bmi < 25) {
            System.out.println("Category: Normal");
        }
        else {
            System.out.println("Category: Overweight");
        }

        input.close();
    }
}