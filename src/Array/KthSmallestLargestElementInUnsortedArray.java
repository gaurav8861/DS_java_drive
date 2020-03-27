package Array;
/**
 * Given an array and a number k where k is smaller than size of array, 
 * we need to find the k’th smallest element in the given array. It is given that ll array elements are distinct.
 */
/**
 * Examples:
 * 
 * Input: arr[] = {7, 10, 4, 3, 20, 15}
 * k = 3
 * Output: 7
 * 
 * Input: arr[] = {7, 10, 4, 3, 20, 15}
 * k = 4
 * Output: 10
 */

public class KthSmallestLargestElementInUnsortedArray {
	
	public static void main(String[] args) {
		int arr[] = {7, 10, 4, 3, 20, 15};
		int k = 4;
		int size = arr.length;
		System.out.println(kthSmallestElementInArray(arr, k, size));
		
	}

	private static int kthSmallestElementInArray(int[] arr, int k, int size) {
		int kthSmallest = arr[0];
		for (int i = 1; i < size; i++) {
			if(kthSmallest > arr[i] && k >= 0) {
				kthSmallest = arr[i];
				k--;
			}
		}
		if(k == 1) {
			kthSmallest = arr[0];
		}
		return kthSmallest;
	}

}
