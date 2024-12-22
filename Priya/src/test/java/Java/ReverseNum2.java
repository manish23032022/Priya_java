package Java;

public class ReverseNum2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a=706424;   //70642 , 7064
		int rev=0;
		while(a!=0) {
			int rem=a%10;  //2,4
			rev= rev*10+rem;   //4*10+2=42  ,42*10+4=424
			a=a/10;
			
			}
		
		System.out.println(rev);
		
		
		

}
}
