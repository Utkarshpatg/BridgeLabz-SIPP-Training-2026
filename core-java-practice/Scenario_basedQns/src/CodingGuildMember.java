public class CodingGuildMember {
    public static void main(String[] args) {

        // Store member details
        String memberName = "Ravi";
        int memberAge = 22;
        String memberRank = "Apprentice";
        double monthlySalary = 50000.0;
        float membershipFee = 999.50f;

        // Calculate annual bonus (12% of salary)
        double annualBonus = monthlySalary * 0.12;

        // Type cast bonus to int
        int bonusAmount = (int) annualBonus;

        // Display Welcome Card
        System.out.println("================================");
        System.out.println("      CODING GUILD WELCOME      ");
        System.out.println("================================");
        System.out.println("Name           : " + memberName);
        System.out.println("Age            : " + memberAge);
        System.out.println("Rank           : " + memberRank);
        System.out.println("Monthly Salary : ₹" + monthlySalary);
        System.out.println("Membership Fee : ₹" + membershipFee);
        System.out.println("Annual Bonus   : ₹" + bonusAmount);
        System.out.println("================================");
        System.out.println("Welcome to the Coding Guild!");
        System.out.println("================================");
    }
}