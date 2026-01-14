import java.util.Arrays;

public class Fibonacci {
    public static void main(String[] args) {
        int n = 28;
        System.out.println(getfibo(n));
    }
    /*
    Time complexity = O(n)
     */
    private static int getfibo(int n) {
        int[] memo = new int[n+1];
        Arrays.fill(memo,-1);
        return fiboUtil(n,memo) ;

    }

    private static int fiboUtil(int n, int[] memo) {
        if(n <= 1)
            return n;
        if(memo[n] != -1)
            return memo[n];

        memo[n] = fiboUtil(n - 1,memo) + fiboUtil(n - 2, memo);

        return memo[n];
    }

    /* time complexity = O(2^n)
    private static int fibo(int n) {
        if (n <= 1)
            return n;
        else {
            return fibo(n - 1) + fibo(n - 2);
        }
    }
     */


}
