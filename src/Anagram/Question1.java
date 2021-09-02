package Anagram;

import java.util.*;

public class Question1 {

    public static void main(String[] args) {

        String str1 = "tic tac cat is act at door";
        String[] str = str1.split(" ");


        Map<String, List<String>> map = new HashMap<>();
        List<String> list = null;
        for (int i=0; i<str.length; i++){
            char ch[] = str[i].toCharArray();
            Arrays.sort(ch);
            String sortedWord = String.valueOf(ch);
            if (map.containsKey(sortedWord)){
                list = map.get(sortedWord);
                list.add(str[i]);
            } else {
                list = new ArrayList<>();
//                list.add(str[i]);
                map.put(sortedWord, list);
            }
        }

        System.out.println(map);

    }
}
