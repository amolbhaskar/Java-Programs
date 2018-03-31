package JavaInterview;

import java.util.HashSet;
import java.util.Set;

public class DuplicateElementsInArray {

	public static void main(String[] args) {
		
		String duplicates[] = new String[]{"java","spring","hibernate","java"};
		
		Set<String> nonDuplicatesSet = new HashSet<String>();
		Set<String> duplicatesSet = new HashSet<String>();
		
		for (String string : duplicates) {
			if(!nonDuplicatesSet.contains(string)){
				nonDuplicatesSet.add(string);
			}
			else{
				duplicatesSet.add(string);
			}
		}
		
		System.out.println(duplicatesSet); //java
	}

}
