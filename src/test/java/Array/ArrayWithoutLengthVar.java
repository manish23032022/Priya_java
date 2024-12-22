package Array;

public class ArrayWithoutLengthVar {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int a[] = { 1, 1, 2, 3, 2, 4, 1, 5 };
		int countLength=0;
		for( int data : a)
		{
			countLength++;
		}
		System.out.println(countLength);
	}

}
