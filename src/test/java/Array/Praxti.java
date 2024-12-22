package Array;

import java.util.LinkedHashSet;
import java.util.Set;

public class Praxti {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int [] a= {10,20,9,3,101,37,1,6,10,20,9};
		Set<Integer> set=new LinkedHashSet<Integer>();
		for(int a1:a) {
			set.add(a1);
		}
		System.out.println(set);
		StringBuilder sb=new StringBuilder();
		for(int a2:set) {
			sb.append(a2);
		}
		System.out.println(sb+ " ," );
		
	}

}
