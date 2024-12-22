package Practice;

public class ThisKeyword {
	int x=10;
	public ThisKeyword() {
		System.out.println("constructor");
	}
	public void m1(int x) {
		System.out.println(x);
		System.out.println(this.x);
	}

	public static void main(String1[] args) {
		// TODO Auto-generated method stub
		
		ThisKeyword tk=new ThisKeyword();
		tk.m1(100);
	}

}//
