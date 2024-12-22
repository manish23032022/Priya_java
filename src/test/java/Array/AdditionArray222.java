package Array;

public class AdditionArray222 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int [] a= {4,9,7,1,0,12,6};
		int sum=0;
		for(int i=0;i<a.length;i++) {
			if(a[i]%2==0 && a[i]%3==0) {
				sum=sum+a[i];
			}
		}
		System.out.println(sum);
	}

}
