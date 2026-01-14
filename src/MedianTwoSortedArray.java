/*
LeetCode - 4
 */

import java.util.Arrays;
import java.util.stream.IntStream;

public class MedianTwoSortedArray {
    public static void main(String[] args) {
        int[] nums1 = {1,2, -3};
        int[] nums2 = {3,4};
        double median = findMedianSortedArrays(nums1,nums2);
        System.out.println(median);
    }

    private static double findMedianSortedArrays(int[] nums1, int[] nums2) {
        int[] mergedArray = IntStream.concat(Arrays.stream(nums1), Arrays.stream(nums2)).toArray();
        double median = 0;
        Arrays.sort(mergedArray);
        if(mergedArray.length % 2 == 0){
            int div = mergedArray.length  / 2 ;
            median = (double) (mergedArray[div - 1] + mergedArray[div]) / 2;
        }else {
            median = (double) mergedArray[mergedArray.length  / 2];
        }
        return median;
    }
}
