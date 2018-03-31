package JavaStudy;

public class Test1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try{
			int o[] = new int[2];
			o[3]=23;
			o[1]=33;
			}catch(Exception e){
			System.out.println(e.getMessage());
			e.printStackTrace();
			}

			System.out.println(o[1]);
			}


	}


