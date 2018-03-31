package JavaInterview;

public class Palindrome {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String original = "madam";
		String reverse = "";
		
		int len = original.length(); //5
		for(int i = len-1; i>=0; i--) //1.i=4 which returns 'o', 2. i=3 which returns'ol', 3. i=2 which returns'oll'
		{
			reverse = reverse+original.charAt(i); //eg. original = "hello", when i=4 which returns 'o', when i=3 which returns'ol'
		}
		
		if(original.equals(reverse)){
			
			System.out.println("String is a palindrome");
		}
		else{
			System.out.println("String is not a palindrome");
		}
		
		
		/*System.out.println("Original is: "+ original);
		System.out.println("Reverse is: "+ reverse); //olleH
	}*/

}
}