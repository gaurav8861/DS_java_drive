package interview;

import java.util.ArrayList;
import java.util.List;

public class MainInt{

    static List<List<Integer>> list = new ArrayList<>();
    public static void main(String[] args) {

        int arr[] = {1,2,3};
        printSubArray(arr, 0, 0);
        System.out.println(list);

    }
    public static void printSubArray(int arr[], int start, int end){
        if (end == arr.length)
            return;
        else if (start > end)
            printSubArray(arr, 0, end + 1);
        else{
            List<Integer> l = new ArrayList<>();
            for (int i = start; i <= end; i++){
                l.add(arr[i]);
            }
            list.add(l);
            printSubArray(arr, start+1, end);
        }
    }
}