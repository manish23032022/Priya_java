package Array;

public class Prac {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	int [] a= {2,8,5,3,9,1,3,5};
	
	for(int i=0;i<a.length;i++) {
		int count=0;
		for(int j=0;j<a.length;j++) {
			if(a[i]==a[j] && i>j) {
				break;
			}
			if(a[i]==a[j]) {
				count++;
				System.out.println(a[i]+": "+count);
			}
		}
//		if(count==) {
//			System.out.println(a[i]+": "+i);
//		}
	}
	}

}
