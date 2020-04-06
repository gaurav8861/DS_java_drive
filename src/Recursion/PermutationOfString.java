package Recursion;

import java.util.Arrays;

public class PermutationOfString {
	
	public static void main(String[] args) {
		int[] arr = {1, 1, 1};
		char[] result = new char[3];
		permutationOfString("ABC", arr, result);
	}

	private static void permutationOfString(String str, int[] arr, char[] result) {
		
		for (int i = 0; i < str.length(); i++) {
			if(arr[i] == 1) {
				result[i] = str.charAt(i);
				arr[i] = 0; 
				permutationOfString(str.substring(i+1), 
						Arrays.copyOfRange(arr, 1, arr.length), 
						Arrays.copyOfRange(result, 1, result.length));
				System.out.println(result);
			}
		}
	}

}
