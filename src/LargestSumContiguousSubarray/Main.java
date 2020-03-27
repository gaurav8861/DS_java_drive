package LargestSumContiguousSubarray;

public class Main {
	
	public static void main(String[] args) {
		
		int arr[] = {-2, -3, 4, -1, -2, 1, 5, -3};
		int max_so_far = 0;
		int max_ending_here = 0;
		
		for (int i = 0; i < arr.length; i++) 
	    { 
	        max_ending_here = max_ending_here + arr[i]; 
	        if (max_so_far < max_ending_here) 
	            max_so_far = max_ending_here; 
	  
	        if (max_ending_here < 0) 
	            max_ending_here = 0; 
	    } 
	   System.out.println(" Result : " + max_so_far ); 
		
	}

}
