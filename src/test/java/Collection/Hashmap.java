package Collection;

import java.util.HashMap;
import java.util.Hashtable;
import java.util.Map;
import java.util.Map.Entry;

public class Hashmap {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//Hashtable<Integer, Integer> map=new Hashtable<Integer, Integer>();
		Map<String,Integer> map=new HashMap();
		map.put("a", 1);
		map.put("b", 3);
		map.put(null, 5);
		map.put("d", null);
		map.put("e", null);
		map.put("f", null);
		
		//insertion order not maintain 
		//allow only one null key but multiple value
		
		System.out.println(map);
		for(Entry<String, Integer> e:map.entrySet()) {
			System.out.println(e.getKey()+" :"+e.getValue());
		}
	
	}}
	


