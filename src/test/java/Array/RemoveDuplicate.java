package Array;

import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.Map;
import java.util.Set;

public class RemoveDuplicate {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n=7;
		int temp=0;
		for(int i=2;i<n-1;i++) {
			if(n%i==0) {
				temp=temp+1;
			}
		}
		if(temp==0) {
			System.out.println("num is prime");
		}
		else {
			System.out.println("num isn't prime");
		}
}}