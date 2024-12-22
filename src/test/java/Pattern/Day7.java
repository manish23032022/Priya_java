package Pattern;

public class Day7 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int r=5;
		int c=5;
		int s=0;
		
		for(int i=1;i<=r;i++) {
			for(int j=1;j<=s;j++) {
				System.out.print(" ");
			}
			for(int k=1;k<=c;k++) {
				System.out.print(k);
			}
			System.out.println();
			c--;
			s++;
		}
		
	}

}
