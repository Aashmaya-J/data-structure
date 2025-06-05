package day1;

	import java.util.Scanner;

	public class task3 {
	    
	    // Recursive method to find factorial
	    public static long factorial(int n) {
	        if (n == 0 || n == 1) {
	            return 1;  // Base case
	        } else {
	            return n * factorial(n - 1);  // Recursive call
	        }
	    }

	    public static void main(String[] args) {
	        Scanner scanner = new Scanner(System.in);

	        System.out.print("Enter a non-negative integer to find its factorial: ");
	        int num = scanner.nextInt();

	        if (num < 0) {
	            System.out.println("Factorial is not defined for negative numbers.");
	        } else {
	            long result = factorial(num);
	            System.out.println("Factorial of " + num + " is " + result);
	        }

	        scanner.close();
	    }
	}


