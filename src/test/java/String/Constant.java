package String;

public class Constant {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s="fghjiuytrosa@#$%";
		System.out.println(s.length());
		int count=0;
		for(int i=0;i<s.length();i++) {
			char ch=s.charAt(i);
			if((ch>='a' && ch<='z' ) && !(ch=='a'|| ch=='e'|| ch=='i'|| ch=='o'|| ch=='u')) {
				count++;
				
				System.out.println(ch+" "+ i);
			}
		}
		System.out.println("Total Consonant:  "+count);
	}

}
