import java.util.Scanner;

public class SubStringCreator {

    public static String createSubstring(String text, int start, int end) {

        String result = "";

        for (int i = start; i < end; i++) {
            result += text.charAt(i);
        }

        return result;
    }

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

        String text = input.next();
        int start = input.nextInt();
        int end = input.nextInt();

        String userSubstring =
                createSubstring(text, start, end);

        String builtInSubstring =
                text.substring(start, end);

        System.out.println("User Substring : " + userSubstring);
        System.out.println("Built-in Substring : " + builtInSubstring);

        System.out.println("Equal : "
                + compareStrings(userSubstring,
                builtInSubstring));
    }
}