package SortingAlgo;

import java.util.Arrays;

public class QuickSort {

    public static void main(String[] args) {
        int l1[] = new int[]{11, 2, 10, 9, 5, 6};
        quickSort(l1, 0, l1.length -1);
//        int partitionIndex = partition(l1, 0, l1.length-1);
//        System.out.println(partitionIndex);
        Arrays.stream(l1).forEach(a -> System.out.print(a + " "));
    }

    private static void quickSort(int[] l1, int start, int end) {
        if (start < end){
            int pIndex = partition(l1, start, end);
            quickSort(l1, start, pIndex-1);
            quickSort(l1, pIndex+1, end);
        }
    }

    private static int partition(int[] l1, int start, int end) {
        int pivot = l1[end];
        int pIndex = start;
        for (int i = start ; i < end; i++){
            if (l1[i] < pivot){
                swap(l1, i, pIndex);
                pIndex++;
            }
        }
        swap(l1, pIndex, end);
        return pIndex;
    }

    private static void swap(int[] l1, int i, int pIndex) {
        int tmp = l1[i];
        l1[i] = l1[pIndex];
        l1[pIndex] = tmp;
    }


}
