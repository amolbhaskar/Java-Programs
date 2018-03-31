package JavaInterview;

import java.util.Arrays;

public class HighestSecondArrayElement {

	//12,3,6,18,20
	//sort->3,6,12,18,20
	//array.length-2
	
	public static void main(String[] args) {
		
		int array[]={12,3,6,18,20};
		Arrays.sort(array);
		System.out.println("Highest number in array: "+array[array.length-1]);
		System.out.println("Second highest number in array: "+array[array.length-2]);
	}
}
