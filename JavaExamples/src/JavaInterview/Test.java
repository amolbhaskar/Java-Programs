package JavaInterview;

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;


public class Test {

	public static void main(String[] args) {
		
		String org="aloha, i like hawaii";
		String rev="";
		
		String s[];
		s=org.split("");
		
		
		
		for(int i=s.length-1; i>=0; i--){
			
			rev=rev+s[i]+"";
		}
		
		System.out.println(rev);
	}
		
}	
