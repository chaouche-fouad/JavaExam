import java.util.Scanner;

public class Solution {
    public static boolean isPalindrome(int x){
        // x is negative or (x is not 0 and x is ends with 0)
        if (x<0) return false;
        if (x != 0 && x % 10 == 0) return false;
        int reverse = 0;
        while (x > reverse){
            int lastDigit = x % 10;
            reverse = reverse * 10 + lastDigit;
            x = x / 10;

        }

        return (x == reverse) || (x == reverse / 10) ;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter an Integer Number :");
        int x = scanner.nextInt();
        boolean result = Solution.isPalindrome(x);
        if (result){
            System.out.println("The Given Number is a Palindrome");
        }else{
            System.out.println("The Given Number is not a Palindrome");

        }
    }
}
