import java.util.*;

public class ThreeSum {
    public static void main(String[] args){
        int[] nums = {-1, 0, 1, 2, -1, -4};
        List<List<Integer>> lists = threeSum(nums);
        for(List<Integer> list: lists){
            System.out.println(list);
        }
    }

    public static List<List<Integer>> threeSum(int[] nums){
        Set<List<Integer>> set = new HashSet<>();
        if(nums.length < 3)
            return new ArrayList<>(set);

        Arrays.sort(nums);
        int sum = 0;
        for(int i = 0; i < nums.length-2; i++){
            int j = i + 1;
            int k = nums.length - 1;
            while(j < k){
                sum = nums[i] + nums[j] + nums[k];
                if(sum == 0) {
                    set.add(Arrays.asList(nums[i], nums[j], nums[k]));
                    j++;
                    k--;
                } else if(sum > 0) {
                    k--;
                } else if(sum < 0) {
                    j++;
                }
            }
        }
        return new ArrayList<>(set);
    }
}
