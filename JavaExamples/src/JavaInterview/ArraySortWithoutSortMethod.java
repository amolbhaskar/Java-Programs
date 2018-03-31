package JavaInterview;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class ArraySortWithoutSortMethod {
	
	//0 1 1 2 3 5 8 13 21

	public static void main(String[] args) {
	
		int a[]={3,45,77,90,25};
		
		for(int i=0;i<a.length; i++){
			
			for(int j=0; j<a.length; j++){
				
				if(a[i]<a[j]){
					
				
				int temp;
				
				temp = a[i];
				a[i] = a[j];
				a[j] = temp;
				
				}
				
			}
		}
		
		for(int i=0;i<a.length; i++)
			
			System.out.println("a["+i+"]="+a[i]);
	}

}
