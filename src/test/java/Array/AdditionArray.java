package Array;

public class AdditionArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int [] a= {6,8,9,12,18};
		int sum=0;
		
		for(int i=0;i<a.length;i++) {
			if(a[i]%2==0 && a[i]%3==0) {
				sum=sum+a[i];
			}
		}
		System.out.println(sum);
	}

}
