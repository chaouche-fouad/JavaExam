import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class Solution {
    // Constant space Solution
    int [] nums;
    public int singleNumber(int [] nums){
        int singleNum = 0;

        for (int num : nums){
            singleNum = singleNum ^ num;
        }
      return singleNum;
    }
    public int[] getNums(){
        return this.nums;
    }
    public void setNums(int [] nums){
        this.nums = nums;
    }
    public static void main(String[] args) {
        int [] nums = {7,5,4,1,3,5,1,3,7};

        Solution solution = new Solution();

        solution.setNums(nums);
        int singleNum = solution.singleNumber(solution.getNums());
        System.out.printf("The single number in the given array %s is %d%n", Arrays.toString(nums), singleNum);


        // linear space solution
//        LinearSpaceSolution linearSpaceSolution = new LinearSpaceSolution();
//        singleNum = linearSpaceSolution.singleNumber(nums);
//        System.out.printf("The single number in the given array %s is %d%n", Arrays.toString(nums),singleNum );
    }
}

//class LinearSpaceSolution{
//    int [] nums;
//    public int singleNumber(int [] nums){
//
//        if (nums.length == 1) return nums [0];
//        Set<Integer> set = new HashSet<>();
//        for (int i = 0 ; i < nums.length; i++){
//            if (set.contains(nums[i])){
//                set.remove(nums[i]);
//            }else {
//                set.add(nums[i]);
//            }
//        }
//        int singleNum;
//        singleNum = set.iterator().next();
//
//        return singleNum;
//    }
//}
