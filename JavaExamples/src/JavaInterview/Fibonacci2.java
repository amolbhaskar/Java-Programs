package JavaInterview;

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class Fibonacci2 {
	
	//0 1 1 2 3 5 8 13 21

	public static void main(String[] args) {
	
	Scanner sc = new Scanner(System.in);
	System.out.println("number= ");
	int n = sc.nextInt();
	
	int f1=0;
	int f2=1;
	System.out.println(f1);
	System.out.println(f2);
	
	int count = 0;
	while(count<=n){
	int f=f1+f2;
	System.out.println(f);
	f1=f2;
	f2=f;
	count++;
	}
	}

}
