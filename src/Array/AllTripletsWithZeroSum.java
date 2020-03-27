package Array;

import java.util.Arrays;

public class AllTripletsWithZeroSum {
	
	/**
	 * Given an array of distinct elements. The task is to find triplets in array whose sum is zero.
	 * @param args
	 */
	/**
	 * 	Input : arr[] = {0, -1, 2, -3, 1}
		Output : 0 -1 1
		         2 -3 1
		
		Input : arr[] = {1, -2, 1, 0, 5}
		Output : 1 -2  1
	 */

	public static void main(String[] args) {
		Integer arr[] = {0, -1, 2, -3, 1};
		tripletsWithSumZero(arr, arr.length);

	}

	private static void tripletsWithSumZero(Integer[] arr, int n) {
		Arrays.sort(arr);
		System.out.println("After Sorting");
		for (int i = 0; i < arr.length; i++) {
			System.out.print(arr[i] + " ");
		}
		System.out.println();
		int found = 0;
		for (int i = 0; i < n-1; i++) {
			int l = i+1;
			int r = n-1;
			int x = arr[i];
			
			while(l < r) {
				if(x + arr[l] + arr[r] == 0) {
					System.out.println(x + ", " + arr[l] + ", " + arr[r]);
					found++;
					l++;
					r--;
				}else if (x + arr[l] + arr[r] < 0) {
					l++;
				}else {
					r--;
				}
			}
		}
		if(found == 0) {
			System.out.println("No triplet found");
		}else {
			System.out.println("Triplet found = " + found);
		}
		
	}
		
	

//	private static void tripletsWithSumZero(Integer[] arr, int n) {
//		Arrays.sort(arr);
//		System.out.println("After Sorting");
//		for (int i = 0; i < arr.length; i++) {
//			System.out.print(arr[i] + " ");
//		}
//		System.out.println();
//		
//		int found = 0;
//		
//		for (int i = 0; i < n; i++) {
//			int x = arr[i];
//			for(int j = i ; j < n-1 ; j++) {
//				int y = arr[j+1];
//				if(y <= x) break;
//				for (int k = j; k < n; k++) {
//					int z = arr[n-1-k];
//					if(z <= y) break;
//					System.out.println("Checking x, y, z = " + x + " " + y + " " + z);
//					if (x + y + z == 0) {
//						System.out.println("Triplet found :");
//						System.out.print(x + " " + y + " " + z);
//						found++;
//						System.out.println();
//					}
//				}
//			}
//		}
//		if(found == 0) {
//			System.out.println("No triplet found");
//		}
//		else {
//			System.out.println("Number of triplet found = " + found);
//		}
//	}

}
