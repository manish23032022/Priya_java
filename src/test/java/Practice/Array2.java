package Practice;

public class Array2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int [] a= {8,99,7,2,5,0,1,8,7,98,};
		int temp=0;
		for(int i=0;i<a.length;i++) {
			for(int j=i+1;j<a.length;j++) {
				if(a[i]>a[j]) {
					temp=a[i];
					a[i]=a[j];
					a[j]=temp;
				}
			}
		}
		for(int i=0;i<a.length;i++) {
			System.out.println(a[i]+" ");
		}
		
	}

}
