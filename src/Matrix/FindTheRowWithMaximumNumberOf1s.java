package Matrix;
/**
 * Given a boolean 2D array, where each row is sorted. Find the row with the maximum number of 1s.
 */
/**
 * Example:
 * 
 * Input matrix
 * 	0 1 1 1
 * 	0 0 1 1
 * 	1 1 1 1  // this row has maximum 1s
 * 	0 0 0 0

Output: 2
 */
public class FindTheRowWithMaximumNumberOf1s {
	
	public static void main(String[] args) {
		int mat[][] = {
				{0, 1, 1, 1},
				{0, 0, 1, 1},
				{1, 1, 1, 1},
				{0, 0, 0, 0}
			};
		int max = 0;
		int count = 0;
		int index = -1;
		for (int i = 0; i < mat.length; i++) {
			for (int j = 0; j < mat.length; j++) {
				if(mat[i][j] == 1) {
					count++;
				}
			}
			if(max < count) {
				max = count;
				index = i;
			}
		}
		System.out.println();
		
	}

}
