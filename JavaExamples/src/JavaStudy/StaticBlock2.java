package JavaStudy;


public class StaticBlock2 {


	
	
	
	public static void main(String[] args) {
		
		System.out.println("String s is: "+s);
	}
	
	
	
	static String s = "";
	static
	{
	s="hello";
	}
}
