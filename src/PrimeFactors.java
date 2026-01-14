/*
Time complexity = O(sqrt(n))
 */


public class PrimeFactors {
    public static void main(String[] args) {
        int n = 315;
        primeFactor(n);
    }

    private static void primeFactor(int n) {
        if ( n % 2 == 0){
            System.out.print(2 + " ");
            n /= 2;
        }
        for ( int i = 3 ; i * i < n ; i +=2){
            while( n % i == 0){
                System.out.print(i + " ");
                n /= i;
            }
        }

        if ( n > 2){
            System.out.println(n);
        }
    }
}
