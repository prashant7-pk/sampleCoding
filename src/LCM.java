import java.sql.SQLOutput;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class LCM {
    /*
    public static void main(String[] args) {
        ArrayList<Integer> arrayList = new ArrayList<>(Arrays.asList(2,5,8,12,5,33));
        int lcm = arrayList.getFirst();
        for ( int i = 1 ; i < arrayList.size() ; i++){
            int num1 = lcm;
            int num2 = arrayList.get(i);
            int gcd_val = getGCD(num1 , num2);
            System.out.println("GCD of "+num1+" and "+num2+": "+gcd_val);
            lcm = (num1 * num2) / gcd_val;

        }
        System.out.println(" LCM :"+lcm);


    }
        */
    private static int getGCD(int num1, int num2) {
        return  num1 == 0 ? num2 : getGCD( num2 % num1, num1);
    }


    public static void main(String[] args) {
        List<Integer> list = Arrays.asList(2,5,8,12,5,33);
        System.out.println("LCM: "+get_LCM(list));
    }

    private static int get_LCM(List<Integer> list) {
        return list.stream().reduce( 1, (x , y) ->
                (x * y) / getGCD(x,y));
    }
}
