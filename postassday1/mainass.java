package day1;

import java.util.Scanner;

public class mainass {
    static Scanner sc = new Scanner(System.in);
    static int[] arr = new int[100];
    static int size = 0;

    public static void main(String[] args) {
        menu();
    }

    static void menu() {
        System.out.println("\n--- Array Manipulator ---");
        System.out.println("1. Insert element");
        System.out.println("2. Delete element");
        System.out.println("3. Display array");
        System.out.println("4. Search element");
        System.out.println("5. Exit");
        System.out.print("Choose an option: ");

        int choice = sc.nextInt();

        switch (choice) {
            case 1:
                insert();
                break;
            case 2:
                delete();
                break;
            case 3:
                display();
                break;
            case 4:
                search();
                break;
            case 5:
                System.out.println("Exiting...");
                return;
            default:
                System.out.println("Invalid choice. Try again.");
        }

        menu();
    }

    static void insert() {
        if (size >= arr.length) {
            System.out.println("Array is full. Cannot insert more elements.");
            return;
        }
        System.out.print("Enter element to insert: ");
        int element = sc.nextInt();
        arr[size++] = element;
        System.out.println("Element inserted.");
    }

    static void delete() {
        if (size == 0) {
            System.out.println("Array is empty. Nothing to delete.");
            return;
        }
        System.out.print("Enter element to delete: ");
        int element = sc.nextInt();

        int i;
        for (i = 0; i < size; i++) {
            if (arr[i] == element) {
                break;
            }
        }

        if (i == size) {
            System.out.println("Element not found.");
            return;
        }

        for (int j = i; j < size - 1; j++) {
            arr[j] = arr[j + 1];
        }

        size--;
        System.out.println("Element deleted.");
    }

    static void display() {
        if (size == 0) {
            System.out.println("Array is empty.");
            return;
        }
        System.out.print("Array elements: ");
        for (int i = 0; i < size; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }

    static void search() {
        if (size == 0) {
            System.out.println("Array is empty.");
            return;
        }
        System.out.print("Enter element to search: ");
        int element = sc.nextInt();

        for (int i = 0; i < size; i++) {
            if (arr[i] == element) {
                System.out.println("Element found at index " + i);
                return;
            }
        }

        System.out.println("Element not found.");
    }
}
