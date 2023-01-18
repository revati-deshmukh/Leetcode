// https://leetcode.com/problems/median-of-two-sorted-arrays/description/
public class MedianOf2SortedArray {
    public static void main(String[] args){
        int[] nums1 = {1, 2, 3};
        int[] nums2 = {2, 4, 6};
        System.out.println(findMedianSortedArrays(nums1, nums2));
    }
    public static double findMedianSortedArrays(int[] nums1, int[] nums2) {
        int[] sortedArr = new int[nums1.length + nums2.length];
        int i = 0;
        int j = 0;
        int k = 0;
        while(i < nums1.length && j < nums2.length){
            if(nums1[i] < nums2[j]) {
                sortedArr[k] = nums1[i];
                i++;
                k++;
            } else {
                sortedArr[k] = nums2[j];
                j++;
                k++;
            }
        }

        while(i < nums1.length){
            sortedArr[k] = nums1[i];
            i++;
            k++;
        }
        while(j < nums2.length){
            sortedArr[k] = nums2[j];
            j++;
            k++;
        }
        int length = sortedArr.length;
        if((sortedArr.length % 2) == 0)
            return ((sortedArr[length/2] + sortedArr[length/2 - 1]) / 2.0);

        return sortedArr[length/2];
    }
}
