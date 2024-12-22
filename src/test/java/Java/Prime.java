package Java;

import java.util.Scanner;

public class Prime {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n=145;
		int temp=n;
		int sum=0;
		
		while(n!=0) {
		int rem=n%10;
		int f=1;
		for(int i=rem;i>0;i--) {
			f=f*i;
		}
		sum=sum+f;
		n=n/10;}
		if(sum==temp) {
			System.out.println("strong num");
		}
		else {
			System.out.println("not strong");
		}
}}
