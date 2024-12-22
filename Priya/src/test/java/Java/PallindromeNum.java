package Java;

public class PallindromeNum {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 String s="dfghjhgfd";
		 
		 String rev="";
		 for(int i=s.length()-1;i>=0;i--) {
			 rev=rev+s.charAt(i);
		 }
		 if(s.equals(rev)) {
		 System.out.println("pallindrome");
	}
		 else {
			 System.out.println("not pallindrom");
		 }
	}
	

}
