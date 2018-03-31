package JavaStudy;

public class Array1 {

	public static void main(String[] args) {
		
		String[] arr =new String[3];
		arr[0]="ab";
		arr[1]="vv";
		arr[2]="gg";
		
		System.out.println(arr.length);
		
		for(String temp : arr)
		{
			System.out.println(temp);
		}

	}

}
