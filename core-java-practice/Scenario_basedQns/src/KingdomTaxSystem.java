import java.util.Scanner;

public class KingdomTaxSystem {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        int numberOfCitizens = 10;
        double[] incomes = new double[numberOfCitizens];

        double totalTaxCollected = 0;

        // Input incomes
        for (int i = 0; i < numberOfCitizens; i++) {

            System.out.print("Enter income of Citizen " + (i + 1) + ": ");
            incomes[i] = input.nextDouble();
        }

        System.out.println("\n===== TAX REPORT =====");

        // Calculate tax for each citizen
        for (int i = 0; i < numberOfCitizens; i++) {

            double income = incomes[i];
            double taxAmount;
            String taxBracket;

            if (income < 10000) {

                taxBracket = "5% Tax Bracket";
                taxAmount = income * 0.05;

            } else if (income <= 50000) {

                taxBracket = "15% Tax Bracket";
                taxAmount = income * 0.15;

            } else {

                taxBracket = "30% Tax Bracket";
                taxAmount = income * 0.30;
            }

            totalTaxCollected += taxAmount;

            System.out.println(
                    "Citizen " + (i + 1) +
                            " | Income: ₹" + income +
                            " | Bracket: " + taxBracket +
                            " | Tax: ₹" + taxAmount
            );
        }

        System.out.println("\nTotal Tax Collected by Kingdom = ₹" +
                totalTaxCollected);

        input.close();
    }
}