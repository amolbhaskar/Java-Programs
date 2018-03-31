package JavaInterview;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;
import java.util.Set;

public class PrimeNumbers1to100 {
	
public static void main(String[] args) {

for(int i=1; i<=100; i++){
	
	boolean isPrime=true;
	
	for (int j=2; j<=i-1; j++){
		
		if(i%j==0){
			isPrime=false;
			break;
		}

	}
	
	if(isPrime==true){
		System.out.print(i);
		System.out.println("\t");
	}
}


}
}