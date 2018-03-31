package JavaStudy;

public class Inheritance_SingleLevel {

	public static void main(String[] args) {
		
		subAdd obj = new subAdd();
		obj.num1 = 5;
		obj.num2 = 4;
		
		obj.sum();
		System.out.println(obj.result);
		obj.sub();
		System.out.println(obj.result);
	}

}


class Add{
	
	int num1,num2,result;
	public void sum()
	{
		result = num1+num2;
		
	}
}

class subAdd extends Add		//SINGLE LEVEL INHERITANCE
{
	public void sub()
	{
		result = num1-num2;
	}
	
}