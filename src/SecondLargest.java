import java.util.Arrays;

public class SecondLargest {
    public static void main(String[] args) {
        int[] arr = {12, 35, 1, 10, 32, 30, 1};
        System.out.println(getSecondLaregest(arr));
    }
    /*
    T() = O(n)
     */
    private static int getSecondLaregest(int[] arr) {
        int secondLargest = -1;
        int largest = -1;
        for(int j : arr){
            if( j > largest){
                secondLargest = largest;
                largest = j;
            } else if ( j > secondLargest && j < largest) {
                secondLargest = j;
            }
        }
        return secondLargest;
    }

    /*
    T() = O(2*n) = O(n)

    private static int getSecondLaregest(int[] arr) {

        int secondLargest = -1;
        int largest = 0;
        for (int j : arr) {
            if (j > largest)
                largest = j;
        }

        for( int i = 0 ; i < arr.length; i++){
            if(arr[i] > secondLargest && arr[i] != largest)
                secondLargest = arr[i];
        }

        return secondLargest;
    }
    */
    /*
    sorting + loop = o(nlog(n) + n)

    private static int getSecondLaregest(int[] arr) {
        Arrays.sort(arr);
        int n = arr.length;
        for( int i = n - 2; i >= 0; i--){
            if( arr[i] != arr[n - 1])
                return arr[i];
        }

        return -1;
    }
     */



}
