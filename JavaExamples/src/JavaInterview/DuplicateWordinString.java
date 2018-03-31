package JavaInterview;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Scanner;
import java.util.Set;

import JavaStudy.Hashmap;

public class DuplicateWordinString {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Please enter a string: ");
		
		String input = sc.nextLine();
		
		String words[] = input.split(" ");
		
		Map<String, Integer> wordmap = new HashMap<String, Integer>();
		
		for (String string : words) {
			
			if(wordmap.get(string) != null ){
				
				wordmap.put(string, wordmap.get(string)+1);
			}
			else{
				
				wordmap.put(string, 1);
			}
		}
		
		Set<String> str2 = wordmap.keySet();
		
		for (String string : str2) {
			
			if(wordmap.get(string)>1)
				
			System.out.println("word "+ string+" repeated " + wordmap.get(string) +" times.");
			
		}
		
		
		
	}
}
