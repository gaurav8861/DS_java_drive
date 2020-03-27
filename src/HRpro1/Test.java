package HRpro1;


/**
 * 
 * @author gauravkumar
 * 
 * An array is a type of data structure that stores elements of the same type in a contiguous block of memory. In an array, , of size , each memory location has some unique index,  (where ), that can be referenced as  (you may also see it written as ).
Given an array, , of  integers, print each element in reverse order as a single line of space-separated integers.
Note: If you've already solved our C++ domain's Arrays Introduction challenge, you may want to skip this.

Input Format

The first line contains an integer,  (the number of integers in ). 
The second line contains  space-separated integers describing .
Constraints
Output Format
Print all  integers in  in reverse order as a single line of space-separated integers.

Sample Input 1
	CopyDownload
	Array: arr
	1
	4
	3
	2
 
	4
	1 4 3 2
Sample Output 1
	2 3 4 1
 *
 */
public class Test {
	
	public static void main(String[] args) {
		
		//int size = 4;
		int arr[] = {1,4,3,2};
		
		int revArray[] = reverseArray(arr);
		System.out.println("******** reverse array *********");
		for (int i = 0; i < revArray.length; i++) {
			System.out.println(revArray[i]);
		}
		
	}

	private static int[] reverseArray(int[] arr) {
		int len = arr.length;
		int rev[] = new int[arr.length];
		int k = 0;
		for (int i : arr) {
			rev[len-1-k] = i;
			k++;
		}
		return rev;
	}

}















