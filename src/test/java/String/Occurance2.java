package String;

import java.util.HashMap;
import java.util.Map;

public class Occurance2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 String s="ertyujkjuytre";
		 char[] arr=s.toCharArray();
		 HashMap<Character,Integer>  map=new HashMap<Character,Integer> ();
		 
		 for(char ch:arr) {
			 map.put(ch, map.getOrDefault(ch, 0)+1);
		 }
		 
		 for(Map.Entry<Character,Integer> result:map.entrySet()) {
			 if(result.getValue()==1) {
				 System.out.println(result.getKey()+" :  "+result.getValue());
			 }
		
		 }
	}

}
