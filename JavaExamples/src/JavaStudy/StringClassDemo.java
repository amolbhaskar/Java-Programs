package JavaStudy;

public class StringClassDemo {

	public static void main(String[] args) {
		
		//endswith
		//starts with
		String name = "welcome to hawaii";
		
		boolean greetings = name.startsWith("welcome");
		System.out.println(greetings);

		boolean hello = name.endsWith("hawaiii");
		System.out.println(hello);
		
		//split
		String fullname = "selenium-hp-qtp-grid";
		String[] arr = fullname.split("-");
		
		//equalsIgnoreCase
		for(int i=0; i<arr.length; i++){
			System.out.println("value for"+" "+i+" "+"is"+" "+arr[i]);
			if(arr[i].equalsIgnoreCase("hhp")){
				System.out.println("test pass");
				break;
			}else{
				System.out.println("test fail");
			}
			
	/*	for(String toolname : arr){
			System.out.println(toolname);*/
		}
		//trim
		String fname = "   amol     bhaskar    ";
		String fullname2 = fname.trim();
		System.out.println(fullname2);
		
		
		//charAt
		String n = "selenium webdriver";
		System.out.println(n.charAt(0));
		
	}

}
