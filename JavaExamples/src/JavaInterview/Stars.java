package JavaInterview;

public class Stars {
	
	public static void main(String[] args) {
		
		for(int i=1; i<=5; i++){
			for(int j=1; j<=i; j++){
				
				//when i=1, j loops one time and come out of the loop. 
				//Next time i=2, so j loops twice and comes out of the loop and so on.
				
				System.out.print("* ");
				
				//System.out.print(i+" ");
				
				//System.out.print(j+" ");
				
			}
			
			System.out.println();
		}
	}

}
