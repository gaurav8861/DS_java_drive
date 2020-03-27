package Array;

import java.util.Arrays;

public class QSort {
	
	public static void main(String[] args) 
    {
        Integer[] array = new Integer[] { 12, 13, 24, 10, 3, 6, 90, 70 };
        System.out.println(Arrays.toString(array));
        quickSort(array, 0, array.length - 1);
    }
 
	private static void quickSort(Integer[] array, int low, int high) {
    	if ((high-low) <= 0) {
    		      return;
    	}  else   {  
    		      int partition = partition(array, 0, array.length - 1);
    		      System.out.println(Arrays.toString(array));
//    		      quickSort(array, low, partition-1);
//    		      quickSort(array, partition+1, high);
    	}
	}

	public static int partition(Integer[] arr, int low, int high) 
    {
        int mid = (low+high)/2;
        int pivot = arr[mid];
        System.out.println("pivot : " + pivot);
        while(true) {
        	System.out.println("Checking :" + arr[low] + " < " + pivot + " -----> " + (arr[low] < pivot));
        	while(arr[low] < pivot) {
            	low++;
            }
        	System.out.println("Checking :" + arr[high] + " > " + pivot + " -----> " + (arr[high] > pivot));
            while(arr[high] > pivot) {
            	high--;
            }
            System.out.println("Value of low :" + arr[low]);
            System.out.println("Value of high :" + arr[high]);
            
            System.out.println("Checking :" + arr[low] + " > " + arr[high] + " -----> " + (arr[low] >= arr[high]));
            if (arr[low] <= arr[high])
                    break;
            else {   
            	System.out.println("Swapping : " + arr[low] + " <---> " + arr[high]);
            	swap(arr, low, high);
            }
        }
        System.out.println("Swapping : " + low + " <---> " + arr[high]);
        swap(arr, low, high);
        return low;
    }
     
    public static void swap (Integer array[], int x, int y)
    {
        int temp = array[x];
        array[x] = array[y];
        array[y] = temp;
    }

}
