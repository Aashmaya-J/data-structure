package day3;

import java.util.Scanner;
public class task2 {
    static class Node {
        int data;
        Node next;
        Node(int d) { data = d; next = null; }
    }

    Node head;
    void insertAtPosition(int data, int pos) {
        Node newNode = new Node(data);

        if (pos == 0) {
            newNode.next = head;
            head = newNode;
            return;
        }

        Node curr = head;
        for (int i = 0; curr != null && i < pos - 1; i++) {
            curr = curr.next;
        }

        if (curr == null) {
            System.out.println("Position out of range");
            return;
        }

        newNode.next = curr.next;
        curr.next = newNode;
    }

    void print() {
        Node curr = head;
        while (curr != null) {
            System.out.print(curr.data + " ");
            curr = curr.next;
        }
        System.out.println();
    }

    public static void main(String[] args) {
        task2 list = new task2();
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter number of insertions: ");
        int n = sc.nextInt();

        for (int i = 0; i < n; i++) {
            System.out.print("Enter value and position (space separated): ");
            int val = sc.nextInt();
            int pos = sc.nextInt();
            list.insertAtPosition(val, pos);
        }

        System.out.print("List after insertions: ");
        list.print();
        sc.close();
    }
}
