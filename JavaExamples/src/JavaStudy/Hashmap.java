package JavaStudy;

import java.util.HashMap;

public class Hashmap {

	public static void main(String[] args) {
		//hashmap use to get key value
		//key is alex and value is 78789
		
		HashMap hm = new HashMap();
		
		hm.put("alex", 78789);
		hm.put("linda", 45645);
		
		System.out.println(hm.get("alex"));
		
		HashMap<String,Double> hm2 = new HashMap<>();
		
		hm.put("alex", 78789.23);
		hm.put("linda", 45645.78);
		
		System.out.println(hm.get("alex"));
		

	}

}
