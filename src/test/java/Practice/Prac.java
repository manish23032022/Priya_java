package Practice;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.Map;
import java.util.Set;

public class Prac {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//String [] s= {"ram","tat","oiuio","fghj"};
		String s="dfghjhjaiueceioiueahgfdfgh";
		int count=0;
		for(int i=0;i<s.length();i++) {
			char ch=s.charAt(i);
			if((ch>'a' && ch<'z') && !(ch=='a' || ch=='o' || ch=='i' || ch=='e' || ch=='u')) {
				count++;
				System.out.println(ch+"  "+i);
			}
		}
		System.out.println(count);
	}
}
