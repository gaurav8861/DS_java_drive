package SortingAlgo;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

/**
 * Merge two sorted arrays
 * l1=[1,4,7,8]
 * l2=[2,3,7,9,10]
 *
 * sorted=[1,2,3,4,7,7,8,9,10]
 *
 */

public class MergeSortAndMergeTwoSortedArrays {

    public static void main(String[] args) {
//        List<Integer> l1 = Arrays.asList(1,4,7,8);
//        List<Integer> l2 = Arrays.asList(2,3,7,9,10);
//
//        List<Integer> l3 = mergeSortedArrays(l1, l2);
//        System.out.println(l3);

        int l1[] = new int[]{11, 2, 10, 9, 5, 6};
        mergeSort(l1, 0, l1.length -1);
        Arrays.stream(l1).forEach(System.out::println);
//        mergeSortedArrays(l1,0, 2, 4);

    }

    /**
     * Merge sort
     */
    private static void mergeSort(int l1[], int low, int high) {
        int mid = (low + high)/2;
        if (low < high){
            mergeSort(l1, low, mid);
            mergeSort(l1, mid+1, high);
            mergeSortedArrays(l1,low, mid, high);
        }
    }

    private static void mergeSortedArrays(int[] l1, int low, int mid, int high) {
        int[] leftArr = new int[mid-low+1];
        int[] rightArr = new int[high-mid];
        for(int i=0; i<leftArr.length; i++){
            leftArr[i] = l1[low+i];
        }
        for(int i=0; i<rightArr.length; i++){
            rightArr[i] = l1[i+mid+1];
        }
        int i = 0;
        int j = 0;
        int k = low;
        while (i < leftArr.length && j < rightArr.length){
            if (leftArr[i] < rightArr[j]){
                l1[k++] = leftArr[i++];
            }
            else if (leftArr[i] > rightArr[j]){
                l1[k++] = rightArr[j++];
            }
        }
        while (i < leftArr.length){
            l1[k++] = leftArr[i++];
        }
        while (j < rightArr.length){
            l1[k++] = rightArr[j++];
        }
        System.out.println();
        Arrays.stream(l1).forEach(a -> System.out.print(a + " "));
        System.out.println();
    }

    /**
     * Merge two sorted arrays
     */
    private static List<Integer> mergeSortedArrays(List<Integer> l1, List<Integer> l2) {
        List<Integer> newList = new ArrayList<>();
        int i=0;
        int j=0;
        while (i < l1.size() && j < l2.size()){
            if (l1.get(i) < l2.get(j)){
                newList.add(l1.get(i));
                i++;
            }
            else if (l1.get(i) > l2.get(j)){
                newList.add(l2.get(j));
                j++;
            } else {
                newList.add(l1.get(i));
                newList.add(l2.get(j));
                i++;
                j++;
            }
        }
        if (i != l1.size()){
            newList.addAll(l1.subList(i, l1.size()));
        }
        if (j != l2.size()){
            newList.addAll(l2.subList(j, l2.size()));
        }
        return newList;
    }
}
