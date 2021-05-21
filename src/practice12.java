import java.util.*;


public class practice12 {
    List<Integer> lst = Arrays.asList(1, 2, 3, 4, 5, 6, 4, 3, 2, 1);

    public static void main(String[] args) {

        Map<Integer, Integer> map = new HashMap<>();
        for (Integer i : new practice12().lst){
            if(map.get(i) == null){
                map.put(i, 0);
            }else {
                map.put(i, map.get(i)+1);
            }
        }
        for (Integer key : map.keySet()){
            if (map.get(key) == 0){System.out.println(key);};
        }


    }

}
