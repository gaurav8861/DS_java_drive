package SortingAlgo;

import java.util.Arrays;

public class SelectionSort {

    public static void main(String[] args) {

        int l1[] = new int[]{11, 2, 10, 9, 5, 6};
        selectionSort(l1);
        Arrays.stream(l1).forEach(a->System.out.print(a+" "));
    }

    private static void selectionSort(int[] l1) {
        for (int j=0; j<l1.length; j++){
            int minIndex = j;

            for (int i = j+1; i < l1.length ; i++){
                if (l1[i] < l1[minIndex]){
                    minIndex = i;
                }
            }
            swap(l1, j, minIndex);
        }
    }

    private static void swap(int[] l1, int i, int minIndex) {
        int tmp = l1[i];
        l1[i] = l1[minIndex];
        l1[minIndex] = tmp;
    }
}
