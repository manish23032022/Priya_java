package String;

public class DictionarySorting {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s1="acg ugy popg eyk vg gu";
	    String[] s=s1.split(" ");
	    String temp="";
	//	int[] s= {4,7,9,3,9};
		for(int i=0;i<s.length;i++) {
		for(int j=i+1;j<s.length;j++) {
			if(s[i].compareTo(s[j])>0) {
				 temp=s[i];
				s[i]=s[j];
				s[j]=temp;
			}
		}
	}
	for(int i=0;i<s.length;i++) {
		System.out.println(s[i]);
	}
	}

}
