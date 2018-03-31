package JavaStudy;

public class Max {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int array[] = {23,5,77,3,67};
		
		int temp = array[0];
		
		for(int i=1;i<array.length;i++)
		{
			if(temp<array[i])
			{
				temp=array[i];
			}
			
		}
		System.out.println(temp);

	}

}
