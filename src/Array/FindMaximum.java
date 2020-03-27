package Array;

/**
 * Given an array arr[], find the maximum j – i such that arr[j] > arr[i]
 */

/**
 *Examples :
 *
 *Input: {34, 8, 10, 3, 2, 80, 30, 33, 1}
 *Output: 6  (j = 7, i = 1)
 *
 *Input: {9, 2, 3, 4, 5, 6, 7, 8, 18, 0}
 *Output: 8 ( j = 8, i = 0)
 *
 *Input:  {1, 2, 3, 4, 5, 6}
 *Output: 5  (j = 5, i = 0)
 *
 *Input:  {6, 5, 4, 3, 2, 1}
 *Output: -1 
 */
//public class FindTheMaximum {
//	
//	public static void main(String[] args) {
//		int arr[] = {34, 8, 10, 3, 2, 80, 30, 33, 1};
//		int size = arr.length;
//		System.out.println("Result");
//		System.out.println("found : " + findMaxInArray(arr, size));
//	}
//
//	private static int findMaxInArray(int[] arr, int n) {
//		int diff = 0;
//		for (int i = 0; i < arr.length; i++) {
//			for (int j = n-1; j >= 0; j--) {
//				if( ((j-i) > diff) && (arr[j] > arr[i])) {
//					diff = j-i;
//				}
//			}
//		}
//		return diff;
//	}
//
//}

public class FindMaximum 
{ 
	int max(int x, int y) 
	{ 
		return x > y ? x : y; 
	} 

	int min(int x, int y) 
	{ 
		return x < y ? x : y; 
	} 

	/* For a given array arr[], returns the maximum j-i such that 
	arr[j] > arr[i] */
	int maxIndexDiff(int arr[], int n) 
	{ 
		int maxDiff; 
		int i, j; 

		int RMax[] = new int[n]; 
		int LMin[] = new int[n]; 

		/* Construct LMin[] such that LMin[i] stores the minimum value 
		from (arr[0], arr[1], ... arr[i]) */
		LMin[0] = arr[0]; 
		for (i = 1; i < n; ++i) 
			LMin[i] = min(arr[i], LMin[i - 1]); 

		/* Construct RMax[] such that RMax[j] stores the maximum value 
		from (arr[j], arr[j+1], ..arr[n-1]) */
		RMax[n - 1] = arr[n - 1]; 
		for (j = n - 2; j >= 0; --j) 
			RMax[j] = max(arr[j], RMax[j + 1]); 

		/* Traverse both arrays from left to right to find optimum j - i 
		This process is similar to merge() of MergeSort */
		i = 0; j = 0; maxDiff = -1; 
		while (j < n && i < n) 
		{ 
			if (LMin[i] < RMax[j]) 
			{ 
				maxDiff = max(maxDiff, j - i); 
				j = j + 1; 
			} 
			else
				i = i + 1; 
		} 

		return maxDiff; 
	} 

	/* Driver program to test the above functions */
	public static void main(String[] args) 
	{ 
		FindMaximum max = new FindMaximum(); 
		int arr[] = {9, 2, 3, 4, 5, 6, 7, 8, 18, 0}; 
		int n = arr.length; 
		int maxDiff = max.maxIndexDiff(arr, n); 
		System.out.println(maxDiff); 
	} 
} 

