package JavaInterview;

public class ReverseStringWord {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String original="My Name is Amol";
		String reverse="";
		
		String s[];
		s = original.split(" ");
		
		for(int i=s.length-1;i>=0; i--) //when i=3, when i=2, when i=1, when i=0
		{
			reverse = reverse + s[i] + " "; // Amol, Amol is, Amol is Name, Amol is Name My
		}
		
		System.out.println(reverse); //Amol is Name My 
	}

}
