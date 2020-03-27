package Array;

public class MoveAllZerosToEndOfArray {
	
	public static void main(String[] args) {
		int arr[] = {1, 2, 0, 4, 3, 0, 5, 0};
		pushZerosToArray(arr, arr.length);
		for (int i = 0; i < arr.length; i++) {
			System.out.print(arr[i] + " ");
		}
	}

	private static void pushZerosToArray(int arr[], int n) {
		int count = 0;
		for (int i = 0; i < arr.length; i++) {
			if(arr[i] != 0) {
				arr[count++] = arr[i];
			}
		}
		while(count < n) {
			arr[count++] = 0;
		}
	}

}
