package JavaInterview;

import java.util.Scanner;

public class Fibonacci {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Please enter the number of terms for fseries: ");
		
		int n = sc.nextInt();
		
		int f1=0;
		int f2=1;
		int f;
		
		System.out.print(f1 + ", "+f2);
		
		for(int count=3; count<=n; count++){
			
			f=f1+f2;
			
			System.out.print(", "+f); 
			
			f1=f2;
			f2=f;
			//f=f1+f2;
			
		}
	}

}
