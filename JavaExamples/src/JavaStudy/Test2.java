package JavaStudy;

public class Test2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try{
			int o[] = new int[2];
			o[3]=23;
			}catch(Exception e){
			System.out.println(e.getMessage());
			e.printStackTrace();
			}


			}


	}

//result-java.lang.ArrayIndexOutOfBoundsException: 3
