package day2;

import java.util.Scanner;

public class task2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("How many spaces you need? ");
        int size = scanner.nextInt();

        Integer[] originalArray = new Integer[size];

        for (int i = 0; i < size; i++) {
            System.out.print("Enter number " + (i + 1) + ": ");
            originalArray[i] = scanner.nextInt();
        }

        Integer[] sortedArray = new Integer[size];
        for (int i = 0; i < size; i++) {
            sortedArray[i] = originalArray[i];
        }

        for (int i = 0; i < size - 1; i++) {
            for (int j = 0; j < size - 1 - i; j++) {
                if (sortedArray[j] < sortedArray[j + 1]) {
                    int temp = sortedArray[j];
                    sortedArray[j] = sortedArray[j + 1];
                    sortedArray[j + 1] = temp;
                }
            }
        }

        System.out.println("Original array:");
        for (int num : originalArray) {
            System.out.print(num + " ");
        }
        System.out.println();

        System.out.println("Sorted array in descending order:");
        for (int num : sortedArray) {
            System.out.print(num + " ");
        }

        scanner.close();
    }
}

