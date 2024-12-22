package Array;

public class AdditionArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int [] x= {6,8,9,12,18};
		int sum=0;
		
		for(int i=0;i<x.length;i++) {
			if(x[i]%2==0 && x[i]%3==0) {
				sum=sum+x[i];
			}
		}
		System.out.println(sum);
	}

}
