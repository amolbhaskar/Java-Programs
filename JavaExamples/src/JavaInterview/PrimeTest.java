package JavaInterview;

public class PrimeTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int num = 31;
		boolean isPrime = true;
		
		for(int i=2; i<num; i++){
			
			if(num % i == 0){
			isPrime = false;
			break;
		}
		}
		if(isPrime){
			System.out.println(num +" is prime");
		}
		else{
			System.out.println(num +" is not prime");
		}
	
	}
}
