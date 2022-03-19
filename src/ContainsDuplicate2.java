import java.util.HashMap;
import java.util.Map;

public class ContainsDuplicate2 {
    public static void main(String[] args){
        ContainsDuplicate2 cd = new ContainsDuplicate2();
        int[] nums = {1,2,3,1};
        int k = 3;
        var result = cd.containsNearbyDuplicate(nums, k);
        System.out.println(result);

        /**
         * Example 1:
         * Input: nums = [1,2,3,1], k = 3
         * Output: true
         *
         * Example 2:
         * Input: nums = [1,0,1,1], k = 1
         * Output: true
         *
         * Example 3:
         * Input: nums = [1,2,3,1,2,3], k = 2
         * Output: false
         * */
    }

    public boolean containsNearbyDuplicate(int[] nums, int k) {
        Map<Integer, Integer> map = new HashMap<>();

        for(int i = 0; i < nums.length; i++){
            if(map.containsKey(nums[i])){
                if(Math.abs(map.get(nums[i]) - i) > k){
                    map.put(nums[i], i);
                }else {
                    return true;
                }
            } else {
                map.put(nums[i], i);
            }
        }
        return false;
    }
}
