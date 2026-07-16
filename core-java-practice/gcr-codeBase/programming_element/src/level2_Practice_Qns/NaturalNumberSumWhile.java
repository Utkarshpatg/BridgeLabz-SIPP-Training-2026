import java.util.Scanner;

public class NaturalNumberSumWhile {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        int number = input.nextInt();

        if(number >= 1) {

            int sum = 0;
            int counter = 1;

            while(counter <= number) {
                sum += counter;
                counter++;
            }

            int formulaSum =
                    number * (number + 1) / 2;

            System.out.println("While Loop Sum = "
                    + sum);

            System.out.println("Formula Sum = "
                    + formulaSum);

            System.out.println("Both are equal? "
                    + (sum == formulaSum));
        }
    }
}