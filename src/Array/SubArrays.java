package Array;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class SubArrays {

    public static void main(String[] args) {
        List<Integer> lst = Arrays.asList(1,2,3,4,5,6);
        subArrays(lst);
        int c = divisibleSumPairs(lst.size(), 3, lst);
        System.out.println(c);
    }
    public static void subArrays(List<Integer> arr){
        int count = 0;
        List<Integer> sums = new ArrayList<>();
        for (int i=0 ; i<arr.size(); i++){

            for (int j=i; j<arr.size(); j++){
                int sum=0;
                for (int k=i; k<=j; k++) {
                    System.out.print(arr.get(k) + " ");
                    sum += arr.get(k);
                }
                count++;
                sums.add(sum);
                System.out.println();
            }

        }
        System.out.println("count : " + count);
        System.out.println("SUMS : " + sums);
    }
    public static int divisibleSumPairs(int n, int k, List<Integer> ar) {
        int count = 0;
        for (int i=0 ; i<ar.size(); i++){
            for (int j=i+1; j<ar.size(); j++){
                int sum = ar.get(j) + ar.get(i);
                if (sum % k == 0)
                    count++;
            }
        }
        return count;
    }
}
