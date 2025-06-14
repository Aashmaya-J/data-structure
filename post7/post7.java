package day7;

import java.util.Scanner;

public class post7 {

	public static void merge(int[] array, int left, int mid, int right) {
		int[] leftArray = new int[mid - left + 1];
		int[] rightArray = new int[right - mid];

		for (int i = 0; i < leftArray.length; i++)
			leftArray[i] = array[left + i];
		for (int j = 0; j < rightArray.length; j++)
			rightArray[j] = array[mid + 1 + j];

		int i = 0, j = 0, k = left;
		while (i < leftArray.length && j < rightArray.length) {
			array[k++] = (leftArray[i] <= rightArray[j]) ? leftArray[i++] : rightArray[j++];
		}
		while (i < leftArray.length)
			array[k++] = leftArray[i++];
		while (j < rightArray.length)
			array[k++] = rightArray[j++];
	}

	public static void mergeSort(int[] array, int left, int right) {
		if (left < right) {
			int mid = (left + right) / 2;
			mergeSort(array, left, mid);
			mergeSort(array, mid + 1, right);
			merge(array, left, mid, right);
		}
	}

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.print("Enter the number of elements: ");
		int size = scanner.nextInt();
		int[] array = new int[size];
		System.out.println("Enter the elements:");
		for (int i = 0; i < size; i++)
			array[i] = scanner.nextInt();

		mergeSort(array, 0, size - 1);

		System.out.println("Sorted array:");
		for (int element : array)
			System.out.print(element + " ");
		scanner.close();
	}
}
