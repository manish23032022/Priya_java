package Array;

public class Element_presentWithIndex {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int [] x= {10,22,3,34,45,4};
		int num=3;
		int count=0;
		int index=0;
		
		for(int i:x) {
			if(i==num) {
				count++;
				break;
			}
			index++;
		}
		if(count==1) {
			System.out.println(num+" is present" +index);
		}
		else {
			System.out.println(num+ " isn't present  " +index);
		}

	}

}
