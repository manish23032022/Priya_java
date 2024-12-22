package Java;

public class Strong_Num {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int num=145;
		int ori=num;
		int sum=0;
		while(num!=0) {
			int rem=num%10;
			int fact=1;
			for(int i=rem;i<=rem;i--) {
				fact=fact*i;
				
			}
			sum=sum+fact;
			num=num/10;
		}
		if(sum==ori) {
			System.out.println(" strong");
		}
		else {
			System.out.println(" isn't strong");
		}
		
		
	}

}
