package SortingAlgo;

import java.util.Arrays;

public class BubbleSort {

    public static void main(String[] args) {

        int arr[] = new int[]{11, 2, 10, 9, 5, 6};
        bubbleSort(arr);
        Arrays.stream(arr).forEach(a->System.out.print(a+" "));
    }

    private static void bubbleSort(int[] arr) {
        for (int i=0 ;i<arr.length; i++){
            for (int j=i+1; j<arr.length;j++){
                if (arr[i]>arr[j])
                    swap(arr, i,j);
            }
        }
    }
    private static void swap(int[] l1, int i, int minIndex) {
        int tmp = l1[i];
        l1[i] = l1[minIndex];
        l1[minIndex] = tmp;
    }
}
