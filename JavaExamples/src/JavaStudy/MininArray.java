package JavaStudy;

public class MininArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//int[] list = new int[]{3,5,9,16,25};
		int[] list = {33,5,9,16,25};
		int smallest=list[0];
		//
		
		for(int i=1; i<list.length; i++)
		{
			if(smallest>list[i])
				smallest=list[i];
				//list[i]=largest;
					
		}
		System.out.println(smallest);
	}

}
