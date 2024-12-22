package Collection;

import java.util.LinkedHashSet;
import java.util.Set;

public class LinkHashSetRemoveDuplicate {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	String s="dfghjhgfdfyu";
	Set<Character> set=new LinkedHashSet<Character>();
	
	for(char ch1:s.toCharArray()) {
		set.add(ch1);
	}
	StringBuilder s1=new StringBuilder();
	for(char ch2:set) {
		s1.append(ch2);
	}
	System.out.println(s1);

	}

}
