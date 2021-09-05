import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class AppendNDeleteMinOperation {

    public static String appendAndDelete(String s, String t, int k) {
        // Write your code here
        return null;
    }

    public static void main(String[] args) {
        List<Integer> ar = Arrays.asList(10, 20 ,20, 10 ,10 ,30 ,50, 10 ,20);
        int n = ar.size();
        int count = 0;
        Map<Integer, Integer> map = new HashMap<>();
        for(int i=0; i<n; i++){
            if(map.containsKey(ar.get(i))){
                map.put(ar.get(i), map.get(ar.get(i))+1);
            }else{
                map.put(ar.get(i), 1);
            }
        }
        System.out.println(map);
        for(Integer key : map.keySet()){
            count += map.get(key)/2;
        }
        System.out.println(count);
        System.out.println(1/2);
        int count1[] = new int[26];
        for (int i=0;i<count1.length;i++){
            System.out.println(count1[i]);
        }
        System.out.println(isPalindrome("aaa"));
        String str = "gaurav";
        for (int i=0 ;i<str.length(); i++){
            String sss = str.substring(0,i) + str.substring(i+1,str.length());
            System.out.println(sss);
        }

    }
    public static boolean isPalindrome(String s){
        int size = s.length();
        for(int i=0;i<size/2;i++){
            if(s.charAt(i) != s.charAt(size - 1 - i)){
                return false;
            }
        }
        return true;
    }
}
