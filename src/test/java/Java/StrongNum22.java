package Java;

public class StrongNum22 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		        int num = 145; // Number to check
		        int originalNum = num; // Store the original number
		        int sum = 0;

		        // Iterate through each digit
		        while (num != 0) {
		            int rem = num % 10; // Get the last digit
		            int fact = 1;

		            // Calculate factorial of the digit
		            for (int i = 1; i <= rem; i++) {
		                fact *= i;
		            }

		            // Add factorial to sum
		            sum += fact;
		            
		            // Remove the last digit
		            num /= 10;
		        }

		        // Check if the sum of factorials equals the original number
		        if (sum == originalNum) {
		            System.out.println(originalNum + " is a strong number.");
		        } else {
		            System.out.println(originalNum + " isn't a strong number.");
		        }
		    
		

	}

}
