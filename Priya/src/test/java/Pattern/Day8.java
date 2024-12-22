package Pattern;

public class Day8 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int r=4;
		int c=1;
		int s=3;
		
		for(int i=1;i<=r;i++) {
			for(int j=1;j<=s;j++) {
				System.out.print(" ");
			}
			for(int k=1;k<=c;k++) {
				System.out.print("*"+" ");
			}
			System.out.println();
			c++;
			s--;
		}
	}

}
