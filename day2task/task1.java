package day2;


	import java.util.Scanner;

	public class task1 {
	    public static void main(String[] args) {
	        Scanner scanner = new Scanner(System.in);

	        System.out.print("Enter the number of elements in the array: ");
	        int n = scanner.nextInt();

	        int[] array = new int[n];

	        System.out.println("Enter the elements of the array:");
	        for (int i = 0; i < n; i++) {
	            array[i] = scanner.nextInt();
	        }

	        int left = 0;
	        int right = array.length - 1;
	        while (left < right) {
	            int temp = array[left];
	            array[left] = array[right];
	            array[right] = temp;

	            left++;
	            right--;
	        }

	        System.out.println("Reversed array:");
	        for (int num : array) {
	            System.out.print(num + " ");
	        }
	        System.out.println();

	        scanner.close();
	    }
	}


