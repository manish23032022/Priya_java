package String;

public class VowelCountPosition {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s="mankisgaegnhiou";
		s=s.toLowerCase();
		int place;
		char[] arr=s.toCharArray();
		System.out.println(arr);
		for(int i=0;i<arr.length;i++) {
			if(arr[i]=='a' || arr[i]=='e' || arr[i]=='i' || arr[i]=='o' || arr[i]=='u' ) {
				place=i;
				System.out.println(arr[i]+" : in "+place+" : place");
				place=0;
				
			}
		}

	}

}
