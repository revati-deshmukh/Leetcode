// https://leetcode.com/problems/maximum-subarray/description/
public class MaxSubArray {
    public static void main(String[] args){
        int[] nums = {-2,1,-3,4,-1,2,1,-5,4};
        System.out.println(maxSubArray(nums));
    }

    public static int maxSubArray(int[] nums) {
        int current = nums[0];
        int sum = nums[0];

        for(int i = 1; i < nums.length; i++){
            current = Math.max(nums[i], current + nums[i]);
            if(current > sum){
                sum = current;
            }
        }
        return sum;
    }
}
