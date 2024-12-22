package Collection;

import java.util.LinkedHashMap;
import java.util.Map;

public class LinkedHashmap {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Map<String, Integer> map=new LinkedHashMap<>();
		map.put("a", null);
		map.put("b", 2);
		map.put("c", null);
		map.put(null, null);
		System.out.println(map);
		//insertion order preserved and only one null key and multiple null value
		//doubly linked (hashtable+linked list)
		//performance slow

	}

}
