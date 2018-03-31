package JavaInterview;

public class ReverseInt {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int original = 123;
		int reverse=0;
		int remainder;
		
		while(original != 0){
			remainder = original % 10; //3 //2 //1
			reverse = reverse * 10 + remainder; //3 //32 //321
			original = original/10;//12 //1 //0
		}
		System.out.println(reverse); //321
	}

}
