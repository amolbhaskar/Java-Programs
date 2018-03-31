package JavaStudy;


public class StaticBlock {

	// this is called as static block which gets executed before main method.
	static
	{
		System.out.println("hello static");
	}
	
	
	
	public static void main(String[] args) {
		
		System.out.println("in main");
	}
	
	// this is called as static block which gets executed before main method.
	static
	{
		System.out.println("bye static");
	}

}
