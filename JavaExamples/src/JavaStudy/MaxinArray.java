package JavaStudy;

public class MaxinArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int[] list = new int[]{3,5,9,16,25};
		int largest=list[0];
		
		for(int i=1; i<list.length; i++)
		{
			if(list[i]>largest)
				largest=list[i];
				//list[i]=largest;
					
		}
		System.out.println(largest);
	}

}
