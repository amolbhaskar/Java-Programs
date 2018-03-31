package Practice;

import java.util.Arrays;

public class Anagram {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(ana("godm","dog"));
		

	}

	public static boolean ana(String str1, String str2){
		
		if(str1.length() != str2.length())
		
		
		return false;
		
		else
			
		{
			char s1[] = str1.toCharArray();
			char s2[] = str2.toCharArray();
			
			Arrays.sort(s1);
			Arrays.sort(s2);
			
			return Arrays.equals(s1, s2);
			
		}
		
		//return true;
		
	}
}
