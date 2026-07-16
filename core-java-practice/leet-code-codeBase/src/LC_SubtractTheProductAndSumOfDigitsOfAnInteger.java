import java.util.Scanner;

public class LC_SubtractTheProductAndSumOfDigitsOfAnInteger {
    public static int subtractProductAndSum(int n) {
        int product = 1;
        int sum = 0;
        int result = 0;
        while(n!=0){
            int temp = n%10;
            product *= temp;
            sum += temp;
            n = n/10;
        }
        return result = product - sum;
    }
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        System.out.println(subtractProductAndSum(n));
    }
}
