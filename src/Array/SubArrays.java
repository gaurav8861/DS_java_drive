package Array;

import java.util.*;

public class SubArrays {

    public static void main(String[] args) {
        List<Integer> lst = Arrays.asList(1, 4, 4, 4, 5, 3);
        subArrays(lst);
//        int c = divisibleSumPairs(lst.size(), 3, lst);
//        System.out.println(c);
//        System.out.println(migratoryBirds(lst));
        System.out.println(dayOfProgrammer(2700));
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

    public static int migratoryBirds(List<Integer> arr) {
        Map<Integer, Integer> map = new HashMap<>();
        for (Integer i : arr){
            if (map.containsKey(i)){
                map.put(i, map.get(i)+1);
            }else{
                map.put(i, 1);
            }
        }
        System.out.println(map);
        int maxKey = 0;
        int val = 0;
        for (Integer j : map.keySet()){
            if(map.get(j) > val){
                val = map.get(j);
                maxKey = j;
            }
        }
        return maxKey;
    }

    public static String dayOfProgrammer(int year) {
        int sum = 243;
        String month = ".09.";
        if (year % 4 == 0){
            sum += 1;
        }
        if (year > 1918) {
            sum -= 14;
            month = ".08.";
        }
        // 31+28+31+30+31+30+31+31=243
        int diff = 256-sum;
        return diff + month + year;
    }
}
