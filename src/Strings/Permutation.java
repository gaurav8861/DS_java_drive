package Strings;

public class Permutation {

    public static void main(String[] args) {
        String str = "ABC";
        permute(str, 0, str.length()-1);
    }

    private static void permute(String str, int low, int high) {
        if (low == high){
            System.out.println(str);
            return;
        }

        for (int i=low; i<high; i++){
            swap(str, low, i);
            permute(str, i+1, high);
            swap(str, low, i);

        }

    }

    private static void swap(String str, int i, int j) {
        char ch[] = str.toCharArray();
        char tmp = ch[i];
        ch[i] = ch[j];
        ch[j] = tmp;
    }

}
