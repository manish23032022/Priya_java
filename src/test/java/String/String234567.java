package String;

public class String234567 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//String s= "Automation";
		
		
		        int[] a = {1, 2,3, 5, 8};  // given array
		        
		        // Iterate through the array to find missing numbers
		        for (int i = 0; i < a.length - 1; i++) {
		            // For each pair, print the missing numbers between a[i] and a[i+1]
		            for (int j = a[i] + 1; j < a[i + 1]; j++) {
		                System.out.print(j + " ");  // print the missing number
		            }
		        }
		    }}
		



