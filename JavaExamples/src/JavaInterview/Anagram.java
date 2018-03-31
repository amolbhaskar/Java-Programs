package JavaInterview;

import java.util.Arrays;

public class Anagram {

	public static void main(String[] args) {

		String str1 = "java";
		String str2 = "avaj";

		System.out.println(checkForAnagram(str1, str2)); // true

	}

	public static boolean checkForAnagram(String string1, String string2) {

		if (string1.length() != string2.length()) {

			return false;
		}

		/*
		 * string1 = string1.toUpperCase(); 
		 * string2 = string2.toUpperCase();
		 */

		char char1[] = string1.toCharArray();
		char char2[] = string2.toCharArray();

		Arrays.sort(char1);
		Arrays.sort(char2);

		return Arrays.equals(char1, char2);
	}

}

/*
 * public class Test { public static void main(String[] args) {
 * 
 * String str1 = "java"; String str2 = "avaj";
 * 
 * char char1[] = str1.toCharArray(); char char2[] = str2.toCharArray();
 * 
 * Arrays.sort(char1); Arrays.sort(char2);
 * 
 * if(Arrays.equals(char1, char2)){ System.out.println("anagram"); } else{
 * System.out.println("no"); } } }
 */
