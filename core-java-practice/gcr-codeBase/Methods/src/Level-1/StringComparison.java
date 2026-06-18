import java.util.Scanner;

public class StringComparison {

    public static boolean compareStrings(String text1, String text2) {

        if (text1.length() != text2.length()) {
            return false;
        }

        for (int i = 0; i < text1.length(); i++) {
            if (text1.charAt(i) != text2.charAt(i)) {
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.print("Enter First String: ");
        String text1 = input.next();

        System.out.print("Enter Second String: ");
        String text2 = input.next();

        boolean userMethod = compareStrings(text1, text2);
        boolean builtInMethod = text1.equals(text2);

        System.out.println("User Method Result : " + userMethod);
        System.out.println("Built-in Method Result : " + builtInMethod);
    }
}