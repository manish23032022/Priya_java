package Array;

public class Asscending {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int [] a= {11,4,8,9,20,10,12,16};
		int temp=0;
		for(int i=0;i<a.length;i++){
			 for(int j=0;j<a.length;j++) {
				 if(a[j]>a[i]) {
					 temp=a[i];
					 a[i]=a[j];
					 a[j]=temp;
				 }
			 }
		}
		for(int i=0;i<a.length;i++) {
		System.out.print(a[i] +" ");
		
		}
	//System.out.println(a[1]);	
	}
}


