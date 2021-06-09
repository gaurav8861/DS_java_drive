import java.util.*;


public class practice12 {

    public static int gcd(int a, int b){
        if(b==0)
            return a;
        return gcd(a, a%b);
    }

    public static int lcm(int a, int b){
        return ((a*b)/gcd(a, b));
    }

    static int findGCD(int arr[], int n)
    {
        int result = arr[0];
        for (int element: arr){
            result = gcd(result, element);

            if(result == 1)
            {
                return 1;
            }
        }

        return result;
    }

    public static void main(String[] args) {
//        int a = 0;
//        int b = 15;

//        System.out.println(gcd(a,b));
//        System.out.println(lcm(a, b));

        int arr[] = { 2, 4, 6, 8, 16 };
        int n = arr.length;
        System.out.println(findGCD(arr, n));

    }

}
