package day1;
import java.util.Scanner;
public class task1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the size of the array: ");
        int size = scanner.nextInt();
        int[] array = new int[size + 1];
        System.out.println("Enter " + size + " elements:");
        for (int i = 0; i < size; i++) {
            array[i] = scanner.nextInt();
        }
        System.out.print("Enter the value to insert: ");
        int value = scanner.nextInt();
        System.out.print("Enter the position (0 to " + size + "): ");
        int position = scanner.nextInt();
        if (position < 0 || position > size) {
            System.out.println("Invalid position!");
        } else {
            for (int i = size; i > position; i--) {
                array[i] = array[i - 1];
            }
            array[position] = value;
            size++;
            System.out.println("Array after insertion:");
            for (int i = 0; i < size; i++) {
                System.out.print(array[i] + " ");
            }
        }
        scanner.close();
    }
}

