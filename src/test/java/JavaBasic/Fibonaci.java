package JavaBasic;

public class Fibonaci {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int x=0;
		int y=1;
		
		for(int i=0;i<=10;i++) {
			int z=x+y;
			System.out.println(z);
			x=y;
			y=z;
		}

	}

}
