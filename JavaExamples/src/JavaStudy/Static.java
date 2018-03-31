package JavaStudy;

public class Static {

	public static void main(String[] args) {
		//Abc.i = 5;
		//Abc obj= new Abc();
		//if method (show()) is static then no need to instantiate class(Abc) and so no need to create an object
		Abc.show();
		
	}
}
	class Abc{
		
	static int i = 5; //static method must have static variables
	
		
	public static void show(){
		
		System.out.println("aloha");
		System.out.println(i);
		
	}
}
	
