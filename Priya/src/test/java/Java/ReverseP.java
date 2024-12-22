package Java;

public class ReverseP {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int [] a= {2,3,4,5,6,1};
		int sum=0;
		for(int i=0;i<a.length-1;i++) {
			//for(int j=1;j<a.length-1;j++) {
				if(a[i]+a[i+1]==7) {
					 System.out.println("Numbers found: " + a[i] + " and " + a[i+1]);
					 break;
					 
				}
			//}
			
		}
		//System.out.println(sum);
		
//		 int[] a = {1, 6, 2, 3, 4, 7, 8,5};
//	        int target = 7;
//
//	        for (int i = 0; i < a.length; i++) {
//	            for (int j = i + 1; j < a.length; j++) {
//	                if (a[i] + a[j] == target) {
//	                    System.out.println("Numbers found: " + a[i] + " and " + a[j]);
//	                }
//	            }
//	        }
	}

}
