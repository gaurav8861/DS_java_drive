package Array;

/* Java program to search an element in 
sorted and rotated array using 
single pass of Binary Search*/

import java.util.*;
import java.util.function.Function;
import java.util.stream.Collectors;
import java.util.stream.Stream;

/**
 * 
 * @author gkumar
 * ALGO : 
 * 
 * 	1) Find middle point mid = (l + h)/2
	2) If key is present at middle point, return mid.
	3) Else If arr[l..mid] is sorted
	    a) If key to be searched lies in range from arr[l]
	       to arr[mid], recur for arr[l..mid].
	    b) Else recur for arr[mid+1..h]
	4) Else (arr[mid+1..h] must be sorted)
	    a) If key to be searched lies in range from arr[mid+1]
	       to arr[h], recur for arr[mid+1..h].
	    b) Else recur for arr[l..mid] 
 *
 */

public class ArraySearchRotatedAndSorted 
{ 	
	//main function 
	public static void main(String args[]) 
	{

		int arr[] = {4, 5, 6, 7, 8, 9, 1, 2, 3}; 
		int n = arr.length; 
		int key = 2; 
		int i = search(arr, 0, n-1, key); 
		if (i != -1) 
			System.out.println("Index: " + i); 
		else
			System.out.println("Key not found");


		List<Integer> lst = Arrays.asList(1,2,3,4,5);
		int sum = lst.stream().mapToInt(a -> a).sum();
		System.out.println(sum);
		System.out.println(lst.stream().allMatch(j -> j>1));
		lst = lst.subList(2, lst.size());
		System.out.println(lst);

		double d = (double)2/(double)6;
		System.out.println((double)2/(double)6);


		String str = "";
		int n1 = 6;
		for(int st = 0; st < n1; st++){
			str = "";
			for (int k = n1-2-st; k >= 0; k--){
				str += " ";
			}
			int d1 = st;
			while(d1-- >= 0){
				str += "#";
			}
			System.out.println(str);
		}



		List<Integer> lll = Arrays.asList(1, 6, 4, 5, 6);
		OptionalInt max = lll.stream().mapToInt(a -> a).max();

		System.out.println(max.getAsInt());

		long count = lll.stream().filter(a -> a == max.getAsInt()).count();
		System.out.println("count " + count);

		HashMap<Integer, Integer> collect = lll.stream()
				.collect(Collectors.toMap(
						Function.identity(),
						word -> 1,
						(a, b) -> a + b,
						HashMap::new));
		System.out.println(collect);





		System.out.println();



		String s1 = "hello";
		String s2 = "world";

		for(int e=0; e<s1.length() ;e++){
			if (s2.contains(Character.toString(s1.charAt(e)))){
				System.out.println("YES");
				break;
			}
		}
		System.out.println("No");




		char[] s12 = s1.toCharArray();
		char[] s12reverse = new char[s12.length];

		for (int ii=0; ii < s12.length; ii++){
			s12reverse[s12.length-1 - ii] = s12[ii];
		}
		for(int r=0; r< s12.length-1 ;r++){
			if (Math.abs(s12[r] - s12[r+1]) != Math.abs(s12reverse[r] - s12reverse[r+1])){
				return;
			}
		}
	}

	private static int search(int[] arr, int l, int h, int key) {
		if (l > h)  
            return -1; 
		int mid = (l+h)/2;
		if(key == arr[mid]) {
			return mid;
		}
		if(arr[l] <= arr[mid]) {
			if(key >= arr[l] && key <= arr[mid]) {
				return search(arr, l, mid-1, key);
			}
			return search(arr, mid+1, h, key);
		}

		if(key >= arr[mid+1] && key <= arr[h]) {
			return search(arr, mid+1, h, key);
		}
		return search(arr, l, mid-1, key);

		
	} 
} 

