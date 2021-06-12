package SortingAlgo;

import java.util.Arrays;

public class InsertionSort {

    public static void main(String[] args) {

        int arr[] = new int[]{11, 2, 10, 9, 5, 6};
        insertionSort(arr);
        Arrays.stream(arr).forEach(a->System.out.print(a+" "));
    }

    private static void insertionSort(int[] arr) {
        for (int i=1; i<arr.length; i++){
            int value = arr[i];
            int index = i-1;
            while (index >= 0 && value < arr[index]){
                swap(arr, index, i);
                index--;
                i--;
            }
        }

    }
    private static void swap(int[] arr, int i, int j) {
        int tmp = arr[i];
        arr[i] = arr[j];
        arr[j] = tmp;
    }
}
