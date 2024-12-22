package String;

public class Remove_Duplicate {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String s="sdfghjhgf";
		int i=0;
		int j=0;
		for(i=0;i<=s.length();i++) {
			char ch=s.charAt(i);
			
			for(j=0;j<=s.length();j++) {
				char ch1=s.charAt(j);
				
				if(ch==ch1) {
					break;
				}
			}
			if(i==j) {
				System.out.println(ch);
			}
		}
			
	}

}
