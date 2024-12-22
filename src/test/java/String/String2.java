package String;

public class String2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s="sdfghjsgfd";
		int i;
		int j;
		for(i=0;i<s.length();i++) {
			int count=1;
			char ch1=s.charAt(i);
			for(j=0;j<s.length();j++) {
				char ch2=s.charAt(j);
				if(ch1==ch2 && i>j) {
					break;
				}
				if(ch1==ch2) {
					count++;
				}
				
			}
			//System.out.println(ch1+" : "+count);
			if(count>1) {
				System.out.println(ch1 +"  "+ count);
			}
			
		}

	}

}
