package Pattern;

public class Day1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n=5 ;
		for(int i=1;i<=n;i++) {
			//print space
			for(int j=n;j>i;j--) {
				System.out.print(" ");
			}
			
			//print "* "
			for(int k=1;k<=2*i-1;k++) {
				System.out.print("*");
			}
			System.out.println();
		}
	}

}
