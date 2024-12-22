package Array;

public class MinNum {
	public static void main(String[] args) {
		
		int [] a= {1,9,5,7,2,0};
		int min=a[0];
		
		for(int i=0;i<a.length;i++) {
			if(min>a[i]) {
				min=a[i];
			}
		}
		System.out.println("min "+ min);
		
	}

}
