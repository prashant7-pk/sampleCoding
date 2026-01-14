public class Combination {
    public static void main(String[] args) {
        int n = 5, r = 2;
        System.out.println(getnCr(n,r));
    }
    /*
    t(o) = O(n)
     */
    private static int getnCr(int n, int r) {
        if( n < r)
            return 0;
        if (r == 0 || r == n)
            return 1;

        int max = Math.max(r, n - r);
        int min = Math.min(r , n - r);

        return multiplier(max + 1, n) / multiplier(1 , min);
    }

    private static int multiplier(int start, int end) {
        int res = 1;
        while( start <= end){
            res *= start;
            start++;
        }
        return res;
    }
    /*
    T(O) = O(n)

    private static int getnCr(int n, int r) {
        if (r == 0 || r == n)
            return 1;
        return factorial(n) / (factorial (r) * factorial(n - r));
    }

    private static int factorial(int n) {
        int res = 1;
        for( int i = 2 ; i <= n ; i++){
            res *= i;
        }
        System.out.println(n+"! = "+res);
        return res;
    }

     */


}
