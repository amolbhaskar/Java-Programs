package JavaInterview;

public class WordFromString {

	public static void main(String[] args) {
	
		String org= "Hello from selenium webdriver";
		
		char[] arr = new char[8]; ////total chars in selenium word = 8
		
		org.getChars(11, 19, arr, 0); // count from 0 zero index, s=11, space after m=19
		
		System.out.println(arr);  //selenium

	}

}
