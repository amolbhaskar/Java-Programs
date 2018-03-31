package Practice;

import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class Duplicatearray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String ar[] = new String[] {"java","qtp","sele","java"};
		
		List list = Arrays.asList(ar);
		Set set = new HashSet<>(list);
		
		if(list.size() != set.size()){
			System.out.println("dup");
		}
		else{
			
		}

	}

}
