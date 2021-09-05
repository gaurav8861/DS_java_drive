package Oops;

import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class Test{

    public static void main(String[] args) {
        List<Integer> list = Arrays.asList(1,6,7,7,8,10,12,13,14,19);
        int count = 0;
        int d = 3;
        Set<Integer> set = new HashSet<>();
        for (Integer i : list){
            set.add(i);
        }
        for(Integer i : list){
            if(set.contains(i+d) && set.contains(i+2*d)){
                System.out.println(i + ", " + (i+d) + ", " + (i+2*d));
                count++;
            }
        }
        System.out.println(count);
    }
}
