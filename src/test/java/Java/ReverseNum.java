package Java;

public class ReverseNum {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int num=98789;
		int temp=num;
		int rev=0;
		while(temp!=0) {
		int	rem=temp%10;
		rev=rev*10+rem;
		temp=temp/10;
		}
		
		System.out.println(rev);
		if(num==rev) {
		System.out.println("revnum");}
		else {
			System.out.println("not rev");
		}
		

	}

}
