package JavaStudy;

public class Inheritance_MultiLevel {

	public static void main(String[] args) {
		
		Mul obj = new Mul();
		obj.num1 = 5;
		obj.num2 = 4;
		
		obj.sum();
		System.out.println(obj.result);
		obj.sub();
		System.out.println(obj.result);
		obj.Multi();
		System.out.println(obj.result);
	}

}


class Add1{		//SUPER/BASE/PARENT CLASS
	
	int num1,num2,result;
	public void sum()
	{
		result = num1+num2;
		
	}
}

class subAdd1 extends Add1		//SINGLE LEVEL INHERITANCE
{
	public void sub()
	{
		result = num1-num2;
	}
	
}

class Mul extends subAdd1		//MULTI-LEVEL INHERITANCE
{
	public void Multi()
	{
		result = num1*num2;
	}
	
}