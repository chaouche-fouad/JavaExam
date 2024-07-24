import java.util.Arrays;



public class Solution {


    public int singleNumber (int [] nums){
        int singleNum = 0;
        for (int num : nums){
            singleNum = singleNum ^ num;
        }
        return singleNum;
    }

    public static void main(String[] args) {
        int[] nums = {7,5,9,5,1,7,9};
        Solution solution = new Solution();
        int singleNumber = solution.singleNumber(nums);
        System.out.printf("The single Number of the given array %s is : %d%n" , Arrays.toString(nums) ,singleNumber);
    }
}
