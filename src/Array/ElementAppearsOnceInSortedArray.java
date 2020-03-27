package Array;
/** Problem
 * 
 * Given a sorted array in which all elements appear twice (one after one) and one element appears only once. 
 * Find that element in O(log n) complexity.
 *
 */
/**
 * Example:

	Input:   arr[] = {1, 1, 3, 3, 4, 5, 5, 7, 7, 8, 8}
	Output:  4
	
	Input:   arr[] = {1, 1, 3, 3, 4, 4, 5, 5, 7, 7, 8}
	Output:  8
 *
 */

/**
 * Algo: 
 * 1) Find the middle index, say ‘mid’.

	2) If ‘mid’ is even, then compare arr[mid] and arr[mid + 1]. 
	If both are same, then the required element after ‘mid’ else before mid.
	
	3) If ‘mid’ is odd, then compare arr[mid] and arr[mid – 1]. 
	If both are same, then the required element after ‘mid’ else before mid.
 * 
 *
 */
public class ElementAppearsOnceInSortedArray {
	
	public static void main(String[] args) {
		int arr[] = {1, 1, 3, 3, 4, 4, 5, 5, 7, 7, 8};
		int n = arr.length;
		elementAppearsOnceInSortedArray(arr, 0, n-1);
	}

	private static void elementAppearsOnceInSortedArray(int[] arr, int low, int high) {
		if(low == high) { 
            System.out.println("The required element is "+arr[low]); 
            return; 
        } 
		int mid = (low+high)/2;
		if(mid % 2 == 0) {
			//even
			if(arr[mid] == arr[mid+1]) {
				//right
				elementAppearsOnceInSortedArray(arr, mid+1, high);
			}
			else {
				//left
				elementAppearsOnceInSortedArray(arr, low, mid);
			}
		}else {
			//odd
			if(arr[mid] == arr[mid-1]) {
				//right
				elementAppearsOnceInSortedArray(arr, mid+1, high);
			}else {
				//left
				elementAppearsOnceInSortedArray(arr, low, mid);
			}
		}
		
	}

//	private static void elementAppearsOnceInSortedArray(int[] arr, int n) {
//		
//		for (int i = 0; i < n; i++) {
//				if((i+1) >= n) {
//					System.out.println("Element Appears Once : " + arr[i]);
//					break;
//				}
//     			if(arr[i] != arr[i+1]) {
//					System.out.println("Element Appears Once : " + arr[i]);
//					i++;
//				}
//     			i++;
//		}
//		
//	}

}
