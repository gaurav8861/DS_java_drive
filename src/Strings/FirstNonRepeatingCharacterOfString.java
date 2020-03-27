package Strings;

/**
 * Given a string, find the first non-repeating character in it. 
 * For example, if the input string is “GeeksforGeeks”, then output should be ‘f’ and if input string is “GeeksQuiz”, 
 * then output should be ‘G’.
 *
 */

/**
 * Algo : 
 * 1) Scan the string from left to right and construct the count array.
 * 2) Again, scan the string from left to right and check for count of each
 * character, if you find an element who's count is 1, return it.
 *
 */

/**
 * Example:
 * 
 * Input string: str = geeksforgeeks
 * 1: Construct character count array from the input string.
 * count['e'] = 4
 * count['f'] = 1
 * count['g'] = 2
 * count['k'] = 2
 * 2: Get the first character who's count is 1 ('f').
 *
 */
public class FirstNonRepeatingCharacterOfString {

	public static void main(String[] args) {
		String str = "GeeksforGeeks";
		System.out.println(firstNonRepeatingCharacter(str));
		
	}

	private static char firstNonRepeatingCharacter(String str) {
		int count[] = new int[26]; 
		str = str.toLowerCase();
		char ch[] = str.toCharArray();
		for (int i = 0; i < str.length(); i++) {
			int c = ch[i] - 97;
			count[c]++;
		}
		for (int i = 0; i < count.length; i++) {
			if(count[i] == 1) {
				return (char) (i + 97);
			}
		}
		return 0;
	}

}
