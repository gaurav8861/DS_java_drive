package Array;

import java.util.Arrays;

public class ReverseArray {


    public static void main(String[] args) {

        int lst[] = {1,2,3,4,5};

//        arrayReverseIterative(lst);
//        arrayReverseRecursive(lst, 0, lst.length-1);
//        Arrays.stream(lst).forEach(System.out::println);

        maxMin(lst);
    }
    public static void arrayReverseIterative(int lst[]){
        int n = lst.length;
        for (int i=0; i<n/2; i++){
            swap(lst, i, n-i-1);
        }
    }

    public static void swap(int lst[], int i, int j){
        int tmp = lst[i];
        lst[i] = lst[j];
        lst[j] = tmp;
    }
    public static void arrayReverseRecursive(int lst[], int start, int end){
        if (start < end){
            swap(lst, start, end);
            arrayReverseRecursive(lst, start+1, end-1);
        }
    }
    public static void maxMin(int lst[]){
        int max = Integer.MIN_VALUE;
        int min = Integer.MAX_VALUE;

        for (int i=0; i<lst.length; i++){
            if (lst[i] > max)
                max = lst[i];
            if (lst[i] < min)
                min = lst[i];
        }
        System.out.println(String.format("min = %d , max = %d", min, max));
    }
}
