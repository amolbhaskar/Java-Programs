package Practice;

import java.util.Arrays;
import java.util.Collections;

public class ArraySort {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str[]={"mn", "ab","cd","ef"};
		
		Arrays.sort(str);
		for(String s1 : str){
			System.out.println(s1);
		}
		
		Arrays.sort(str,Collections.reverseOrder());
		for(String s1 : str){
			System.out.println(s1);
		}

	}

}
