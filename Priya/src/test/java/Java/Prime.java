package Java;

public class Prime {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int num=18;
		int temp=0;
		
		for(int i=1;i<=num;i++) {
			for(int j=2;j<i-1;j++) {
				if(i%j==0) {
					temp=temp+1;
				}
			}
		
		
		if(temp==0) {
			System.out.println(i);
		}
		else {
			temp=0;
		}

	}}

}
