package JavaInterview;

public class ReverseString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String original = "Hello";
		String reverse = "";
		
		int len = original.length(); //5
		for(int i = len-1; i>=0; i--) //1.i=4 which returns 'o', 2. i=3 which returns'ol', 3. i=2 which returns'oll'
		{
			reverse = reverse+original.charAt(i); //when i=4 which returns 'o', when i=3 which returns'ol'
		}
		
		System.out.println(reverse);
		
	}

}
