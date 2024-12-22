package JavaBasic;

public class MethodRecursion {
	
	public void m1() {
		
		m2();
		System.out.println("m1 run");
	}
	public void m2() {
		
		m3();
		System.out.println("m2 run");
	}
	public void m3() {
		System.out.println("m3 run");
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		MethodRecursion mr=new MethodRecursion();
		mr.m1();
	}

}
