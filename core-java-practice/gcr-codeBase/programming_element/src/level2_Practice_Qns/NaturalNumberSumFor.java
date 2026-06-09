import java.util.Scanner;

public class NaturalNumberSumFor {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        int number = input.nextInt();

        int sum = 0;

        for(int i = 1; i <= number; i++) {
            sum += i;
        }

        int formulaSum =
                number * (number + 1) / 2;

        System.out.println("For Loop Sum = "
                + sum);

        System.out.println("Formula Sum = "
                + formulaSum);
    }
}