package Practice;

public class StrongNum {
	
	//5!+4!+1

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int num=1450;
		int temp=num;
		int sum=0;
		
		while(temp!=0) {
			int rem=temp%10;
			int fact=1;
			for(int i=rem;i>0;i--) {
				fact=fact*i;
			}
			sum=sum+fact;      //120
			temp=temp/10;
		}
		if(num==sum) {
			System.out.println("strong num");
		}
		else {
			System.out.println("not strong");
		}

	}

}
