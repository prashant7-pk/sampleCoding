import java.io.*;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

/*
Given an array arr[] of n integers and a target value,
check if there exists a pair whose sum equals the target.
This is a variation of the 2-Sum problem.
 */
public class TimeComplexity {

    /*
    time complexity O(n^2)
     */
   /* static boolean twoSum(int[] arr, int target){
        int n = arr.length;

        for ( int i = 0; i < n ; i++){
            for ( int j = i + 1 ; j < n ; j++){
                if( arr[i] + arr[j] == target){
                    return true;
                }
            }
        }
        return false;
    }
    */


    /*
    The sorting logic take O(nlogn) - Quick sort and one for loop take O(n)
    total time complexity - 0(nlogn)

    static boolean twoSum(int[] arr, int target){
        int n = arr.length;
        Arrays.sort(arr);
        for (int i =0 ; i < n ;i++){
            int compliment = target - arr[i];
            //use binary search to calculate the compliment
            if ( binaryseacrh(arr , i , n - 1 , compliment )){
                return true;
            }
        }
        return false;
    }

    private static boolean binaryseacrh(int[] arr, int low , int high, int compliment) {
        while ( low <= high){
            int mid = low + (high - low) / 2;

            if(arr[mid] == compliment){
                return true;
            }else if ( arr[mid] < compliment){
                low = mid + 1;
            }else{
                high = mid - 1;
            }
        }
        return false;
    }
        */

    /*
    The one take only O(n) time is the best approach.
     */
    static  boolean twoSum(int[] arr , int target){
        HashSet<Integer> hashSet = new HashSet<>();
        for (int j : arr) {
            int compliment = target - j;
            if (hashSet.contains(compliment)) {
                return true;
            } else {
                hashSet.add(j);
            }
        }
        return false;

    }
    public static void main(String[] args) {
        int target = 3;
        int[] arr = {0, -1, 2, -3, 1};
        if(twoSum(arr,target)){
            System.out.println("Pair exist");
        }else{
            System.out.println("No Pair exist");
        }

    }
}