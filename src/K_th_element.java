/*
The idea is to sort the input array in descending order,
so the first k elements in the array will be the k largest elements.
 */

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class K_th_element {
    public static void main(String[] args) {
        int[] arr = {1, 23, 12, 9, 30, 2, 50};
        int k = 3;

       ArrayList<Integer> arrInteger =  getArrayofSizeKInDescOrder(arr , k);

       arrInteger.forEach(System.out::print);
    }
    /*
    Time complexity: O(n * log n)
     */
    private static ArrayList<Integer> getArrayofSizeKInDescOrder(int[] arr , int k) {

        int n = arr.length;

        Integer[] integerArray = Arrays.stream(arr).boxed().toArray(Integer[]::new);

        Arrays.sort(integerArray , Collections.reverseOrder());

        return new ArrayList<>(Arrays.asList(integerArray).subList(0, k));
    }
}
