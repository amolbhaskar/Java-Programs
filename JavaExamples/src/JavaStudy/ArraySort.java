package JavaStudy;

import java.util.Arrays;

public class ArraySort {

	public static void main(String[] args) {
		
		int[]numbers = {1,3,4,5,6,3,2,4,6,7,9,4,12,3,4,6,8,9,7,6,43,2,4,7,7,5,2,1,3,4,6,311,1};
		Arrays.sort(numbers);
		
		int last=numbers[0];
		int count=-1;
		
		//enhanced for loop
		for(int i : numbers)
		{
			if(i == last){
				count++;
				continue;
			}
			System.out.println("Number "+last+" found "+count+" times ");
			count=1;
			last=i;
			
		}
		System.out.println("Number "+last+" found "+count+" times ");

	}

}
