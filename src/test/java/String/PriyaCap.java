package String;

public class PriyaCap {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 String s = "Priya kumar";
		 String s1=s.toLowerCase();
		 String[] s2=s1.split(" ");
	//	String s2=s1.toLowerCase();
		
	        for(String ch:s2) {
	        	System.out.print(ch);
	        }
	        
	        //String s1 = s.substring(0, s.length() - 2) + Character.toUpperCase(s.charAt(s.length() - 2)+s.charAt(s.length()-1));
	        
	       
	        System.out.println(s2);
	}

}
