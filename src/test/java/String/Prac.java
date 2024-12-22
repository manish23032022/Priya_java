package String;

public class Prac {
	public static void main(String[] args) {
	String s="binitbMahEDOsfW1234566543";
////	char ch=s.charAt(0);
////	System.out.println(ch);
////	String s1=s.replace("b", "");
////	System.out.println(s1.concat("b"));
////	String s2=s1.concat("b");
////	System.out.println(s2);
////	char ch=s.charAt(0);
////	System.out.println(s.substring(1)+ch);
//	
//	//System.out.println(s.replaceAll("[^a-z0-9]", ""));
//	//System.out.println(s.substring(1));
//	System.out.println(s.indexOf('i',2));
	String s1=s.toUpperCase();
	System.out.println(s1);
	
	for(int i=0;i<s.length();i++) {
		System.out.println(s.substring(i));
	}
	}

}
