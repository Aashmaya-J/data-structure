package day3;
import java.util.Scanner;
public class main3 {
    static class Node {
        int data;
        Node next;
        Node(int data) {
            this.data = data;
            this.next = null;
        }
    }
    private Node head;
    public void initializeList(int[] values) {
        for (int value : values) {
            Node newNode = new Node(value);
            if (head == null) {
                head = newNode;
            } else {
                Node current = head;
                while (current.next != null)
                    current = current.next;
                current.next = newNode;
            }
        }
    }
    public void reverse() {
        Node prev = null;
        Node current = head;
        Node next = null;
        while (current != null) {
            next = current.next;  
            current.next = prev;  
            prev = current;      
            current = next;      
        }
        head = prev; 
    }
    public void printList() {
        if (head == null) {
            System.out.println("Linked List is empty.");
            return;
        }
        Node current = head;
        System.out.print("Linked List: ");
        while (current != null) {
            System.out.print(current.data);
            if (current.next != null)
                System.out.print(" → ");
            current = current.next;
        }
        System.out.println();
    }
    public static void main(String[] args) {
        main3 list = new main3();
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter number of elements: ");
        int n = scanner.nextInt();
        int[] values = new int[n];
        for (int i = 0; i < n; i++) {
            System.out.print("Enter value " + (i + 1) + ": ");
            values[i] = scanner.nextInt();
        }
        list.initializeList(values);
        System.out.println("\nOriginal list:");
        list.printList();
        list.reverse();
        System.out.println("\nReversed list:");
        list.printList();
        scanner.close();
    }
}


