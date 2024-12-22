package Java;

public class PallindronStringArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String [] s= {"ram","tat","oiuio","fghj"};
		//String s="dfghjhjaiueceioiueahgfdfgh";
		for(int i=0;i<s.length;i++) {
			String org=s[i];
			System.out.println(org);
			StringBuilder sb=new StringBuilder();
			sb.append(org);
			String rev=sb.reverse().toString();
			if(org.equals(rev)) {
				System.out.println("is pallindron  :  "+rev);
			}
			else {
				System.out.println("isn't pallindrone :   "+rev);
			}
	}

}}
