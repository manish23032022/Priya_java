package Array;

public class SumOfAllArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int [] x= {1,9,9,8,6,7,3,12};
		int sum=0;
		
		for(int i=0;i<x.length;i++) {
			if(x[i]%2==0 && x[i]%3==0) {
			sum=sum+x[i];
		}
		}
		System.out.println(sum);
	}

}
