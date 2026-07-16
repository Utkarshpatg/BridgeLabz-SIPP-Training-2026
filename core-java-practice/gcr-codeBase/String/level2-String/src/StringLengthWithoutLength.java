import java.util.Scanner;

public class StringLengthWithoutLength {

    public static int findLength(String text) {

        int count = 0;

        try {

            while (true) {
                text.charAt(count);
                count++;
            }

        } catch (Exception e) {

        }

        return count;
    }

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.print("Enter Text: ");
        String text = input.next();

        int userLength = findLength(text);
        int builtInLength = text.length();

        System.out.println("Length using User Method = " + userLength);
        System.out.println("Length using length() = " + builtInLength);
    }
}