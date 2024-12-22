package Pattern;

public class Day5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int r=5;
		int c=5;
		int num=1;
		
		for(int i=1;i<=r;i++) {
			for(int j=1;j<=c;j++) {
				System.out.print(num++ +" ");
			}
			System.out.println();
			c--;
		}

	}

}
