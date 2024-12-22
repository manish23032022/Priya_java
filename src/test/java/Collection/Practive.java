package Collection;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.Map;
import java.util.Set;

import javax.print.DocFlavor.CHAR_ARRAY;
import javax.swing.plaf.InternalFrameUI;

public class Practive {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int [] a= {4,8,1,3,4,1};
		for(int i=0;i<a.length;i++) {
			int count=0;
			for(int j=0;j<a.length;j++) {
				if(a[i]==a[j] && i>j) {
					break;
				}
				if(a[i]==a[j]) {
					count++;
				}
			}
			if(count==1) {
				System.out.println(a[i]);
			}
		}
		
	}

}
