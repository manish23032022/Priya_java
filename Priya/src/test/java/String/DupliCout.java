package String;

public class DupliCout {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s="dfghjhrdfghjk";
		int i=0;
		int j=0;
		for(i=0;i<s.length();i++) {
//			int count=0;
			char ch1=s.charAt(i);
			
			for(j=0;j<s.length();j++) {
				char ch2=s.charAt(j);
				
				if(ch1==ch2) {
					break;
				}
				
		}
			if(i==j) {
				System.out.println(ch1);
			}
	}

}}
