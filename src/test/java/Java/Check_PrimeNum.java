package Java;

public class Check_PrimeNum {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int num=5;
		int temp=0;
		for(int i=2;i<num-1;i++) {
			if(num%i==0) {
				temp=temp+1;
			}}
			if(temp==0) {
				System.out.println("num is prime");
			}
			else {
				System.out.println("not prime");
			}
		}
		
	}


