import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Solution {
    List<String> fizzBuzz(int n){
        List<String> answer = new ArrayList<>();
        for (int i = 1 ; i <= n ; i++){
            if (i % 3 == 0 && i % 5 == 0){
                answer.add("FizzBuzz");
            } else if (i % 3 == 0) {
                answer.add("Fizz");
            } else if (i % 5 == 0) {
                answer.add("Buzz");
            }else {
                answer.add("" + i);
            }
        }
        return answer;
    }

    public static void main(String[] args) {
        Solution solution = new Solution();
        Scanner scanner = new Scanner(System.in);
        System.out.print("Input : ");
        int n = scanner.nextInt();
        System.out.println("Output : " + solution.fizzBuzz(n));
    }
}

