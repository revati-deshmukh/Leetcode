public class ArithmeticSlices {

    public static void main(String[] args){
        ArithmeticSlices as = new ArithmeticSlices();
        int[] nums = {1,2,3,4};
        System.out.println(as.numberOfArithmeticSlices(nums));

        /**
         * Example 1:
         * Input: nums = [1,2,3,4]
         * Output: 3
         * Explanation: We have 3 arithmetic slices in nums: [1, 2, 3], [2, 3, 4] and [1,2,3,4] itself.
         *
         * Example 2:
         * Input: nums = [1]
         * Output: 0
         * */
    }

    public int numberOfArithmeticSlices(int[] nums) {
        if(nums.length <= 2)
            return 0;

        int count = 0, output = 0;
        for(int i = 1; i < nums.length -1 ; i++){
            if((nums[i-1] - nums[i]) == (nums[i] - nums[i+1])){
                count++;
            } else {
                count = 0;
            }
            output += count;

        }

        return output;
    }
}
