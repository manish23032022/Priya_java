package String;

public class VowelCount {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s="aeobguiouaevgh";
		int count=0;
		for(int i=0;i<s.length();i++) {
			char ch=s.charAt(i);
			if(ch=='a' || ch=='e' || ch=='o'|| ch=='i' || ch=='u') {
				count++;
			}
		}
		System.out.println("vowel count"+count);

	}

}
