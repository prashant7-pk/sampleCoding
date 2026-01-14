public class ThirdLargest {
    public static void main(String[] args) {
        int[] arr = {12, 35, 1, 10, 32, 30, 31};
        System.out.println(getThirdLaregest(arr));
    }

    private static int getThirdLaregest(int[] arr) {
        int first = -1, second = -1 , third = -1 ;
        for ( int i : arr){
            if( i > first){
                third = second;
                second = first;
                first = i;
            } else if ( i > second) {
                third = second;
                second = i;
            } else if (  i > third) {
                third = i;
            }
        }
        return  third;
    }
}
