import java.util.Scanner;

public class SumUntilZero {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        double total = 0.0;

        System.out.print("Enter number: ");
        double number = input.nextDouble();

        while(number != 0) {

            total += number;

            System.out.print("Enter number: ");
            number = input.nextDouble();
        }

        System.out.println("Total Sum = " + total);
    }
}