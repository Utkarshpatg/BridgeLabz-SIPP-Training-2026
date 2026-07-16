import java.util.Scanner;
public class LC_palindromeNumber {
    public static void main(String[] args) {
       Scanner sc = new Scanner(System.in);
       int num = sc.nextInt();
        System.out.println(isPalindrome(num));

    }
    public static boolean isPalindrome(int x) {
        int rev =0;
        int num = x;
        while(num>0){
            int rem = num%10;
            rev = rev*10 + rem;
            num = num/10;
        }
        if(rev == x ){
            return true;
        }
        else{
            return false;
        }
    }
}