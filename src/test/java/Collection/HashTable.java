package Collection;

import java.util.Hashtable;
import java.util.Map;

public class HashTable {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Map<String, Integer> map=new Hashtable<>();
		map.put("a", 4);
		map.put("b", 4);
		map.put("c", 5);
		
		//doesn't allow null key and value
		//map.put("c", null);
		//map.put(null, 4);
		System.out.println(map);
		
	}

}
