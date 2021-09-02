package interview;

import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class MainPractice {

    public static void main(String[] args) {

        String s = "geeks for geeks is for geeks";
// geeks 3 for 2 is 1
        String str[] = s.split(" ");
        Map<String, Integer> map = new HashMap<>();
        for(int i =0 ; i<str.length; i++){
            if(!map.containsKey(str[i])){
                map.put(str[i], 1);
            }else{
                map.put(str[i], map.get(str[i])+1);
            }


        }
        String result = "";
        for(String key : map.keySet()){
            result += key + ": " + map.get(key) + " ";
        }
        System.out.println(result);

        List<Integer> list = Arrays.asList(1,2,3,4,5,6,7,10,9);
        long count = list.stream().collect(Collectors.summingInt(Integer::intValue));
        System.out.println(count);
    }


}
