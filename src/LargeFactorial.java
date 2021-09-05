import java.math.BigInteger;
import java.util.LinkedList;

public class LargeFactorial {

    public static int factorial(int n){
        if (n ==0){
            return 1;
        }
        if (n == 1){
            return 1;
        }
        return n * factorial(n-1);
    }

    public static void main(String[] args) {
        int n = 5;
        System.out.println(factorial(n));

//        LinkedList<Integer> factorial = new LinkedList<>();
        BigInteger sum = BigInteger.valueOf(1);
        for (int i = 1; i<=200; i++){
            sum = sum.multiply(BigInteger.valueOf(i));
        }
        System.out.println(sum);
    }
}
