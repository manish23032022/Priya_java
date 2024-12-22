package Collection;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;

public class HashMapCount {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s1 = "the the is best the best";

        // Split the string into words using space as the delimiter
        String[] s = s1.split(" ");
		//String ss="avsfavsfca";
		//char[] s=ss.toCharArray();
		Map<String, Integer> map=new LinkedHashMap<String, Integer>();
		
		for(String s2:s) {
			map.put(s2, map.getOrDefault(s2, 0)+1);
				
		}
		System.out.println("result" + " :" +map);
		for(Map.Entry<String, Integer> e:map.entrySet()) {
			if(e.getValue()>0) {
				System.out.println(e.getKey()+" :"+e.getValue());
			}
	
		}
	}

}
