import java.util.Arrays;
// https://leetcode.com/problems/maximum-product-of-three-numbers/description/

public class MaximumProductOfThree {
    /**
     * Example 1:
     * Input: nums = [1,2,3]
     * Output: 6
     *
     * Example 2:
     * Input: nums = [1,2,3,4]
     * Output: 24
     *
     * Example 3:
     * Input: nums = [-1,-2,-3]
     * Output: -6
     *
     * */
    public static void main(String[] args){
        int[] nums = {-1, -2, -3};
        System.out.println(maximumProduct(nums));
    }

    public static int maximumProduct(int[] nums) {
        Arrays.sort(nums);
        int i = 0;
        int maxP = 1;
        while(i < 3){
            maxP *= nums[nums.length-1-i];
            i++;
        }

        return Math.max(maxP, nums[0]*nums[1]*nums[nums.length-1]);
    }
}
