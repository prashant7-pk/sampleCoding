/*
Given an array of n numbers, our task is to calculate the maximum subarray sum
 */

public class MaximumSubArraySum {

    public static void main(String[] args) {
        int[] arr = {-2, -3, 4 , -1, -2 , 1 ,5 , -3};
        int maxSum = maxSum(arr);
        System.out.println("maximum subarray sum : "+maxSum);
    }

    /*

    time complexity = O(n^2)

    private static int maxSum(int[] arr) {
        int max = 0;
        for(int i = 0 ; i < arr.length ; i++){
            int sum = 0;
            for( int j = i + 1 ; j < arr.length ; j++){
                sum = sum + arr[j];
                max = Math.max(max,sum);
            }
        }
        return max;
    }
     */

    /*
    Best approach time complexity = O(n)
     */
    private static int maxSum(int[] arr) {
        int sum = 0 , maximum = 0;
        for (int i : arr){
            sum = Math.max(i, sum + i);
            maximum = Math.max(maximum,sum);
        }
        return maximum;
    }

}
