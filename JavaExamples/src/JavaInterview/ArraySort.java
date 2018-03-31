package JavaInterview;

import java.util.Arrays;
import java.util.Collections;

public class ArraySort {
	
	public static void main(String[] args) {
		
		String str[] = {"d","a","z","m"};
		
		System.out.println("Array before sorting: ");
		
		for (String string : str) {
			System.out.println(string);
		}
		
		Arrays.sort(str);
		System.out.println("Array sort in ascending order: ");
		for (String string : str) {
			System.out.println(string);
		}
		
		Arrays.sort(str, Collections.reverseOrder());
		System.out.println("Array sort in descending order: ");
		for (String string : str) {
			System.out.println(string);
		}
	}

}
