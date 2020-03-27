package Array;
/**
 * Find an element which divides the array in two subarrays with equal product
 * Given, an array of size N. Find an element which divides the array into two sub-arrays with equal product. 
 * Print -1 if no such partition is not possible.
 *
 */


/**
 * Examples :
 * Input : 1 4 2 1 4
 * Output : 2
 * If 2 is the partition, 
 * subarrays are : {1, 4} and {1, 4}
 * Input : 2, 3, 4, 1, 4, 6
 * Output : 1
 * If 1 is the partition, 
 * Subarrays are : {2, 3, 4} and {4, 6}
 *
 */
public class ElementWhichDividesArrayInTwoSubarraysWithEqualProduct {
	
	public static void main(String[] args) {
		//int arr[] = {1, 4, 2, 1, 4};
		int arr[] = {2, 3, 4, 1, 4, 6};
		System.out.println(partitionOfArrayWithTwoSameProduct(arr, arr.length));
	}

	private static int partitionOfArrayWithTwoSameProduct(int[] arr, int n) {
		int l = 1;
		int r = 1;
		for (int i = 1; i < n; i++) {
			r *= arr[i];
		}
		for (int i = 0; i < n; i++) {
			l *= arr[i];
			r /= arr[i+1];
			if(l == r) {
				return arr[i+1];
			}
		}
		return -1;
	}
	
	

}
