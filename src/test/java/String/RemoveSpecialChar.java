package String;

public class RemoveSpecialChar {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s="!@#$man@#$$ish234(*&^";
		String s1=s.replaceAll("[^a-zA-Z0-9]", "");
		System.out.println(s1);

	}

}
