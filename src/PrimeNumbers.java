public class PrimeNumbers {
    public static void main(String[] args) {
        int n = 113;
        System.out.println("Is prime "+isPrime(n));
    }
    /*
    t(o) = o(squaroot(n))
     */
    private static boolean isPrime(int n) {
        if( n == 2 || n == 3)
            return true;
        for ( int i = 2; i * i < n ; i++){
            if(n % i == 0)
                return false;
        }
        return true;
    }
}
