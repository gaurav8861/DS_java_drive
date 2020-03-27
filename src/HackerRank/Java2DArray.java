package HackerRank;

/**
 * 
 * @author gauravkumar
 * You are given a  2D array. An hourglass in an array is a portion shaped like this:
a b c
  d
e f g
For example, if we create an hourglass using the number 1 within an array full of zeros, it may look like this:
1 1 1 0 0 0
0 1 0 0 0 0
1 1 1 0 0 0
0 0 0 0 0 0
0 0 0 0 0 0
0 0 0 0 0 0
Actually, there are many hourglasses in the array above. The three leftmost hourglasses are the following:
1 1 1     1 1 0     1 0 0
  1         0         0
1 1 1     1 1 0     1 0 0
The sum of an hourglass is the sum of all the numbers within it. The sum for the hourglasses above are 7, 4, and 2, respectively.
In this problem you have to print the largest sum among all the hourglasses in the array.
Input Format
There will be exactly  lines, each containing  integers seperated by spaces. Each integer will be between  and  inclusive.
Output Format
Print the answer to this problem on a single line.
Sample Input
1 1 1 0 0 0
0 1 0 0 0 0
1 1 1 0 0 0
0 0 2 4 4 0
0 0 0 2 0 0
0 0 1 2 4 0
Sample Output
19
Explanation
The hourglass which has the largest sum is:
2 4 4
  2
1 2 4
 *
 */

import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;

import javax.print.attribute.HashAttributeSet;

public class Java2DArray {

	private static final Scanner scanner = new Scanner(System.in);

	public static void main(String[] args) {
		int[] a = { 1, 1, 1, 0, 0, 0, 0, 1, 0, 0, 0, 0, 1, 1, 1, 0, 0, 0, 0, 0, 2, 4, 4, 0, 0, 0, 0, 2, 0, 0, 0, 0, 1,
				2, 4, 0 };
		int[][] arr = new int[6][6];
		int k = -1;
		for (int i = 0; i < 6; i++) {
			for (int j = 0; j < 6; j++) {
				arr[i][j] = a[++k];
			}
		}
		System.out.println("************* input array *************");

		for (int i = 0; i < 6; i++) {
			for (int j = 0; j < 6; j++) {
				System.out.print(arr[i][j] + " ");
			}
			System.out.println();
		}
		System.out.println("************* end array *************");
		int l = 0;
		System.out.println("************* Start array ************* " + l);
		Integer arr1[][] = new Integer[3][3];
		Map<Integer, Integer[][]> map = new HashMap<>();
		int x = 0;
		int y = 0;
		for (int p = 0; p < 16; p++) {

			for (int i = x; i < x + 3; i++) {
				for (int j = y; j < y + 3; j++) {
					System.out.print(arr[i][j] + " ");
				}
				System.out.println();
			}
			System.out.println("============ next ========== " + ++l);

			if (x == 0 && y == 3) {
				x = x + 1;
			}
			if (x > 3) {
				x = 0;
				y = y + 1;
			}
		}
		// x = x+1;

		/*
		 * System.out.println("********* Horizontal *******"); for (int p = 0; p < 4;
		 * p++) {
		 * 
		 * for (int i = 0; i < 3; i++) { for (int j = y; j < y+3; j++) {
		 * System.out.print(arr[i][j] + " "); } System.out.println(); } y++;
		 * System.out.println("============ next =========="); }
		 */
	}

}
