package problem1;

import java.util.HashMap;
import java.util.Map;

public class Main {

	public static void main(String[] args) {
		String s = "this_is_variable";
		char[] ch = s.toCharArray();
		int i = 0 ;
		while (true){
			if(ch[i] == '_'){
				ch[i+1] =  Character.toUpperCase(ch[i+1]);
				ch[i] = '\0';
			}
			if (i == s.length()-1)
				break;
			i++;
		}
		String s1 = String.valueOf(ch);
		s1 = s1.replaceAll(String.valueOf('\0'),"");

		System.out.println(s1);



		String s2 = "thisIsVariable";
		char[] ch1 = s2.toCharArray();
		String res = "";
		int j = 0;
		while (true){
			if (Character.isUpperCase(ch1[j])){
				res += "_" + String.valueOf(Character.toLowerCase(ch1[j]));
			}else {
				res += String.valueOf(ch1[j]);
			}
			if (j == s2.length()-1)
				break;
			j++;
		}
		System.out.println(res);

		String s3 = "aaddcbb";
		String result = "";
		Map<Character, Integer> map = new HashMap<>();
		for (int k=0; k<s3.length();k++){
			char c = s3.charAt(k);
			if (map.get(c) == null) {
				map.put(c, 1);
			}
			else{
				map.put(c, map.get(c)+1);
			}
		}
		for (char c : map.keySet())
			result += String.valueOf(c) + "" + map.get(c);
		System.out.println(result);
	}
}
