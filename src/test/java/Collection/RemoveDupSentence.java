package Collection;

import java.util.HashSet;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class RemoveDupSentence {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s1="the the is best the best";
		String[] s=s1.split(" ");
		//System.out.println(s2);
		//String s="dfghjhgf";
		Set<String> set=new LinkedHashSet<String>();
		for(String s2:s) {
			set.add(s2);
		}
		System.out.println(set);
		
		for(String sss:set) {
			System.out.println(sss);
		}
		
	
}}
