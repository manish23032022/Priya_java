package Practice;

public class ThisKeyword {
	int x=10;
	public void m1(int x) {
		System.out.println(x);
		System.out.println(this.x);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		ThisKeyword tk=new ThisKeyword();
		tk.m1(100);
	}

}
