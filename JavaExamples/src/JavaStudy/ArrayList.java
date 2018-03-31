package JavaStudy;

import java.util.List;

public class ArrayList {

	public static void main(String[] args) {
		
		String [] name = new String[5];
		name[0] = "ab";
		name[3] = "kl";
		name[4] = "sd";
		
		System.out.println(name.length);
		
		for(String temp : name)
		{
			System.out.println(temp);
		}

	//List list = new ArrayList();
	List list = new java.util.ArrayList();
	//List<String>list1 = new ArrayList<>();
	
	list.add("gg");
	list.add(2);
	list.add(true);
	
	for(Object temp2 : list)
	{
		System.out.println(temp2);
	}
	
		
		
	}

}
