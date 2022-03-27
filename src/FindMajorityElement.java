import java.util.HashMap;
import java.util.Map;

public class FindMajorityElement {
    public static void main(String[] args){
        FindMajorityElement fme = new FindMajorityElement();
        int[] nums = {2,2,1,1,1,1,1,2,2};
        int result = fme.majorityElement(nums);
        System.out.println(result);

        /**
         * Example 1:
         * Input: nums = [3,2,3]
         * Output: 3
         *
         * Example 2:
         * Input: nums = [2,2,1,1,1,2,2]
         * Output: 2
         * */
    }

    public int majorityElement(int[] nums) {
        Map<Integer, Integer> map = new HashMap<>();
        for(int i: nums){
            int count = map.containsKey(i) ? map.get(i) : 0;
            map.put(i, count + 1);
        }

        int max = 0;
        int length = nums.length / 2;
        for(int key: map.keySet()){
            if(map.get(key) > length){
                max = key;
                break;
            }
        }
        return max;
    }
}
