package Array;
/**
 * Given an array of n positive integers and a number k. 
 * Find the minimum number of swaps required to bring all the numbers less than or equal to k together.
 */

/**
 * Input:  arr[] = {2, 1, 5, 6, 3}, k = 3
 * Output: 1
 * 
 * Explanation:
 * To bring elements 2, 1, 3 together, swap 
 * element '5' with '3' such that final array will be arr[] = {2, 1, 3, 6, 5} 
 * 
 * Input:  arr[] = {2, 7, 9, 5, 8, 7, 4}, k = 5
 * Output: 2
 */
public class MinimumSwapsRequiredToBringAllElementsLessThanOrEqualToKTogether {
	
	public static void main(String[] args) {
		int arr[] = {2, 1, 5, 6, 3, 0};
		int k = 3;
		int size = arr.length;
		System.out.println(NoOfSwapsToBringElementsOnOneSide(arr, k, size));
	}

	private static int NoOfSwapsToBringElementsOnOneSide(int[] arr, int k, int size) {
		int count = 0;
		int lastElement;
		int lastIndex = size-1;
		
		for (int i = 0; i < size; i++) {
			lastElement = arr[lastIndex];
			while(k < arr[i] && k >= arr[lastIndex--]) {
				count ++;
			}
		}
		return count;
	}

}
