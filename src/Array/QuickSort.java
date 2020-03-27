package Array;

public class QuickSort {
	
	private static int quickSort(int[] arr, int n, int k) {
		int i = 0;
		int j = 0 ;
		
		int pivot = selectPivotElement(arr, n);
		setPivotElementToLastElementOfArray(arr, pivot, n);
		while (i < n) {
			if(arr[i] < pivot) {
				swap(arr, j, i);
				j = i;
			}
			i++;
		}
		swap(arr, n-1, j+1);
		return j+1;
	}

	private static void setPivotElementToLastElementOfArray(int[] arr, int pivot, int n) {
		if(pivot != arr[n-1]) {
			swap(arr, 0, n-1);
		}
	}

	private static void swap(int arr[], int i, int j) {
		if ( i == j) return ;
		arr[i] = arr[i] + arr[j];
		arr[j] = arr[i] - arr[j];
		arr[i] = arr[i] - arr[j];
	}

	private static int selectPivotElement(int[] arr, int n) {
		return arr[n-1];
	}

	private static int kthLargestElement(int[] arr, int n, int k) {
		return arr[n - k];
	}

	public static void main(String[] args) {
		int arr[] = {7, 10, 4, 3, 20, 15};
		// {3, 4, 7, 10, 15, 20}
		int n = arr.length;
		int k = 2;
		
		System.out.println("Before sorting :");
		for (int i = 0; i < arr.length; i++) {
			System.out.print(arr[i] + " ");
		}
		System.out.println();
		
		int partitionIndex = quickSort(arr, n, k);
		
		
		System.out.println("After sorting :");
		for (int i = 0; i < arr.length; i++) {
			System.out.print(arr[i] + " ");
		}
		System.out.println();
		System.out.println(kthLargestElement(arr, n, k));
//		swap(arr, 0, 1);
//		for (int i = 0; i < arr.length; i++) {
//			System.out.print(arr[i] + " ");
//		}
	}

}
