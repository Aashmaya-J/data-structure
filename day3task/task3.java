package day3;

import java.util.Scanner;

public class task3 {

    static class Node {
        int data;
        Node next;
        Node(int d) { data = d; next = null; }
    }

    Node head;

    void deleteAtPosition(int pos) {
        if (head == null) return;
        if (pos == 0) {
            head = head.next;
            return;
        }
        Node curr = head;
        for (int i = 0; curr != null && i < pos - 1; i++) {
            curr = curr.next;
        }
        if (curr == null || curr.next == null) return;
        curr.next = curr.next.next;
    }

    void print() {
        Node curr = head;
        while (curr != null) {
            System.out.print(curr.data + " ");
            curr = curr.next;
        }
        System.out.println();
    }

    void append(int data) {
        if (head == null) {
            head = new Node(data);
            return;
        }
        Node curr = head;
        while (curr.next != null) {
            curr = curr.next;
        }
        curr.next = new Node(data);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        task3 list = new task3();

        System.out.print("Enter number of nodes: ");
        int n = sc.nextInt();

        System.out.println("Enter " + n + " node values:");
        for (int i = 0; i < n; i++) {
            int val = sc.nextInt();
            list.append(val);
        }

        System.out.print("Original list: ");
        list.print();

        System.out.print("Enter position to delete (0-based): ");
        int pos = sc.nextInt();

        list.deleteAtPosition(pos);

        System.out.print("After deletion: ");
        list.print();

        sc.close();
    }
}
