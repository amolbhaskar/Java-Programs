package Practice;

import java.util.HashSet;
import java.util.Set;

public class Dupe {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s[]={"java","qtp","javam","selenium"};
		
		Set<String> nondup = new HashSet<>();
		Set<String> dup = new HashSet<>();
		
		for(String temp : s){
			if(!nondup.contains(temp)){
				nondup.add(temp);
				System.out.println(nondup);
			}
			else{
				dup.add(temp);
				
			}
		}
		System.out.println(dup);
	}

}
