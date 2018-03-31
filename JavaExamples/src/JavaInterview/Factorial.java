package JavaInterview;

import java.util.Scanner;

public class Factorial {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Please enter a NUMBER: ");
		int number = sc.nextInt();
		
		int result=1; //minimum result of factorial is 1
		
		if(number<=0)
		{
			result = 1;
		}
		else
		{
			for(int i=1; i<=number; i++)
			{
				result = result * i;
			}
			
		}
		
		System.out.println("The Factorial of a number is: "+ result);
		
	}

}
