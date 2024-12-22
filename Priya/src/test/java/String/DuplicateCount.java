package String;

public class DuplicateCount {
   public static void main(String[] args) {
	String s="abvsabaabsh";

	char[] arr=s.toCharArray();
	for(int i=0;i<arr.length;i++) {
		int count=1;
		for(int j=i+1;j<arr.length;j++) {
			if(arr[i]==arr[j]) {
				arr[j]=' ';
				count++;
			}
		}
		if(count>=1 && arr[i]!=' ') {
			System.out.println(arr[i]+"  :  "+count);
		}
	}
}
}
