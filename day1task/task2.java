package day1;

	import java.util.Scanner;

	public class task2 {
	    public static void main(String[] args) {
	        Scanner scanner = new Scanner(System.in);

	        // Get the size of the array from the user
	        System.out.print("Enter the number of elements in the array: ");
	        int n = scanner.nextInt();

	        int[] arr = new int[n];

	        // Input array elements
	        System.out.println("Enter " + n + " elements:");
	        for (int i = 0; i < n; i++) {
	            arr[i] = scanner.nextInt();
	        }

	        // Initialize max and min to the first element
	        int max = arr[0];
	        int min = arr[0];

	        // Find max and min in the array
	        for (int i = 1; i < n; i++) {
	            if (arr[i] > max) {
	                max = arr[i];
	            }
	            if (arr[i] < min) {
	                min = arr[i];
	            }
	        }

	        // Print max and min
	        System.out.println("Maximum value in the array: " + max);
	        System.out.println("Minimum value in the array: " + min);

	        scanner.close();
	    }
	}


