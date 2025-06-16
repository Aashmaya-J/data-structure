package day9;
import java.util.Arrays;
import java.util.Scanner;
public class task2 {
	public static void main(String[] args) {
		int[] array = { 1, 2, 4, 4, 5, 6, 8 };
		Scanner scanner = new Scanner(System.in);
		System.out.print("Enter the target value to find and count: ");
		int target = scanner.nextInt();
		int lowerBoundIndex = lowerBound(array, target);
		int upperBoundIndex = upperBound(array, target);
		if (lowerBoundIndex < array.length && array[lowerBoundIndex] == target) {
			int count = upperBoundIndex - lowerBoundIndex;
			System.out.println("Target " + target + " occurs " + count + " time(s) in the array.");
			System.out.println("Lower bound index: " + lowerBoundIndex);
			System.out.println("Upper bound index: " + upperBoundIndex);
		} else {
			System.out.println("Target " + target + " does not appear in the array.");
		}

		scanner.close();
	}
	public static int lowerBound(int[] array, int target) {
		int left = 0;
		int right = array.length;
		while (left < right) {
			int mid = left + (right - left) / 2;
			if (array[mid] < target) {
				left = mid + 1;
			} else {
				right = mid;
			}
		}
		return left;
	}
	public static int upperBound(int[] array, int target) {
		int left = 0;
		int right = array.length;
		while (left < right) {
			int mid = left + (right - left) / 2;
			if (array[mid] <= target) {
				left = mid + 1;
			} else {
				right = mid;
			}
		}
		return left;
	}
}
