package Array;

public class Element_present {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//int [] x=new int[5];
		int [] x= {2,6,7,9,15};
		int num=156;
		int count=0;
//		x[0]=2;
//		x[1]=6;
//		x[2]=7;
//		x[3]=9;
//		x[4]=15;
		
		for(int i:x) {
			if(i==num) {
				count++;
				break;
			} }
		if(count==1) {
			System.out.println(num+"  is present");
		}
		else {
			System.out.println(num +" isn't present");
		}
		
	}}
			
	
