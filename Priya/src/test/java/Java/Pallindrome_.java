package Java;

import java.util.Scanner;

public class Pallindrome_ {
	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		System.out.println("enter number");
		
		int n=sc.nextInt();
		int temp=n;
		int rev=0;
		while(temp!=0) {
			int rem=temp%10;
			rev=rev*10+rem;
			temp=temp/10;
			
		}
		if(rev==n) 
			System.out.println("pallindrome");
		
		else 
			System.out.println("not pallidrome");
		
	}

}
