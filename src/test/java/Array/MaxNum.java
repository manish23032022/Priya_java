package Array;

public class MaxNum {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int [] a= {2,3,6,1,9,10,4};
		int max=a[0];
		for(int i=0;i<a.length;i++) {
			if(max<a[i]) {
				max=a[i];
			}
			
		}
		System.out.println("max "+ max);

	}

}
