import java.util.Arrays;
import java.util.Map;
import java.util.TreeMap;

// https://leetcode.com/problems/relative-sort-array/description/
public class RelativeSortArray {
    public static void main(String[] args){
        int[] arr1 = {2, 3, 1, 3, 2, 4, 6, 7, 9, 2, 19};
        int[] arr2 = {2, 1, 4, 3, 9, 6};
        int[] ans = relativeSortArray(arr1, arr2);
        System.out.println(Arrays.toString(ans));
    }

    public static int[] relativeSortArray(int[] arr1, int[] arr2) {
        Map<Integer, Integer> map = new TreeMap<>();
        int length = arr1.length;
        for(int ele : arr1){
            int count = map.containsKey(ele) ? map.get(ele) : 0;
            map.put(ele, count + 1);
        }
        int index = 0;
        for(int ele : arr2){
            if(map.containsKey(ele)){
                int count = map.get(ele);
                while(count != 0) {
                    arr1[index] = ele;
                    index++;
                    count--;
                }
                map.remove(ele);
            }
        }

        while(index != length) {
            for (var entry : map.entrySet()) {
                int count = entry.getValue();
                while (count != 0) {
                    arr1[index] = entry.getKey();
                    index++;
                    count--;
                }
            }
        }

        return arr1;
    }
}
