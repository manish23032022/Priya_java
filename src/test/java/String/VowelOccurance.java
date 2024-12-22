package String;

public class VowelOccurance {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s="asdfuieeobca";
		int count=0;
	//	int place;
		
		for(int i=0;i<s.length();i++) {
			
			char ch=s.charAt(i);
			//System.out.println(ch);
			if(ch=='a' || ch=='e' || ch=='i' || ch=='o' || ch=='u') {
				count++;
		  System.out.println(ch+"   : "+i);
//				  
			}
		}
		System.out.println("count vowel total"+" :"+count);

	}

}
