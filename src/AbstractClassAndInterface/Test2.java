package AbstractClassAndInterface;


import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class Test2 {

    public static void main(String[] args) {
        List<String> lst1 = new ArrayList<String>();
        lst1.add("candidate1");
        lst1.add("candidate2");
        lst1.add("candidate3");
        lst1.add("candidate2");
        lst1.add("candidate3");
//        lst1.add("candidate2");


        Map<String, Integer> map = new HashMap<>();
        for (String cadidate: lst1){
            if (map.get(cadidate) != null){
                map.put(cadidate, map.get(cadidate)+1);
            }
            else{
                map.put(cadidate, 1);
            }
        }

        int max = Integer.MIN_VALUE;
        String winner = "";
        boolean is_break = true;
        for (String key : map.keySet()){
            if (max == map.get(key)){
                System.out.println("No winner");
                is_break=false;
                break;
            }
            if (map.get(key) > max){
                max = map.get(key);
                winner = key;
            }
        }
        if (is_break)
            System.out.println(winner);


    }



}
