package Anagram;

public class Permutation {

    public static void main(String[] args) {

        String str = "abc";
        // abc, acb, bac, bca, cab, cba ==> 3! = 6

        permutation(str, "");
    }

    private static void permutation(String str, String dest) {
        if (str.length() == 0){
            System.out.println(dest);
            return;
        }
        for (int i=0; i<str.length(); i++) {
            char c = str.charAt(i);
            String lstr = str.substring(0, i);
            String rstr = str.substring(i+1);
            String s = lstr + rstr;
            permutation(s, dest+c);
        }
    }
}
