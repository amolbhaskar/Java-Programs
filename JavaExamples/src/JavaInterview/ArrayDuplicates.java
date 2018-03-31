package JavaInterview;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class ArrayDuplicates {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//create an array with duplicate string values
		String [] duplicates = new String[]{"java","spring","hibernate","java"};
		
		//convert array to Arraylist
		List arraylist = Arrays.asList(duplicates);
		
		//create hashset from arraylist
		Set set = new HashSet<>(arraylist);
		
		//compare the size of both
		if(arraylist.size() != set.size()){
			
			System.out.println("array contains duplicates");
		}
		else{
			System.out.println("array doesnt contain duplicates");
		}
	}

}
