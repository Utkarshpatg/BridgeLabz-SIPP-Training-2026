import java.util.Scanner;

public class coffeCounter {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        final double GST_PERCENT = 18.0;

        while (true) {

            System.out.println("\n===== Coffee Menu =====");
            System.out.println("Espresso");
            System.out.println("Latte");
            System.out.println("Cappuccino");
            System.out.println("Mocha");
            System.out.println("Type 'exit' to stop");

            System.out.print("Enter Coffee Type: ");
            String coffeeType = input.next();

            if (coffeeType.equalsIgnoreCase("exit")) {
                System.out.println("Cafe Closed. Thank You!");
                break;
            }

            System.out.print("Enter Quantity: ");
            int quantity = input.nextInt();

            double pricePerCoffee = 0;

            switch (coffeeType.toLowerCase()) {

                case "espresso":
                    pricePerCoffee = 120;
                    break;

                case "latte":
                    pricePerCoffee = 150;
                    break;

                case "cappuccino":
                    pricePerCoffee = 180;
                    break;

                case "mocha":
                    pricePerCoffee = 200;
                    break;

                default:
                    System.out.println("Invalid Coffee Type!");
                    continue;
            }

            double totalBill = pricePerCoffee * quantity;
            double gstAmount = (totalBill * GST_PERCENT) / 100;
            double finalBill = totalBill + gstAmount;

            System.out.println("\n----- Bill Details -----");
            System.out.println("Coffee Type : " + coffeeType);
            System.out.println("Quantity    : " + quantity);
            System.out.println("Base Bill   : ₹" + totalBill);
            System.out.println("GST (18%)   : ₹" + gstAmount);
            System.out.println("Final Bill  : ₹" + finalBill);
        }

        input.close();
    }
}