package Pattern;

public class Day9 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int r=4;
		int c=1;
		int s=3;
		for(int i=1;i<=r;i++) {
			for(int j=1;j<=c;j++) {
				System.out.print("*");
			}
			for(int k=1;k<=s;k++) {
				System.out.print(" ");
			}
			System.out.println();
			c++;
			s--;
		}

	}

}
