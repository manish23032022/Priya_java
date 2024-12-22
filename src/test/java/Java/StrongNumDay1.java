package Java;

public class StrongNumDay1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int num=125;
		int n=num;
		
		int sum=0;
		while(n!=0) {
		int rem=n%10;
		int fact=1;		
				for(int i=rem;i>=1;i--) {
					fact=fact*i;
				}
				sum=sum+fact;
				n=n/10;
		}
		if(num==sum) {
			System.out.println("strong Num");
		}else {
			System.out.println("not strong");
		}
		
	}

}
