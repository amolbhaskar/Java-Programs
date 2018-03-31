package JavaStudy;

public class Static2 {

	public static void main(String[] args) {
	
		A obj1 = new A();
		A obj2 = new A();
		A obj3 = new A();

		obj3.counter();
		
		A.A();
	}

}

class A{
	
	static int i;//only int i is a instance variable but static int i is a class variable
	public static void A(){
		 i++;
		 System.out.println("static i value is: "+i);
	 }
	
	public void counter(){
		System.out.println(i);
	}
}