package day4;

import java.util.Scanner;

public class post4 {

    // Node class for Doubly Linked List
    static class Node {
        int data;
        Node prev;
        Node next;

        Node(int data) {
            this.data = data;
            this.prev = null;
            this.next = null;
        }
    }

    Node head = null;
    Node tail = null;

    // Insert at end (used to build list)
    void insertAtEnd(int data) {
        Node newNode = new Node(data);
        if (head == null) {
            head = tail = newNode;
        } else {
            tail.next = newNode;
            newNode.prev = tail;
            tail = newNode;
        }
    }

    // Traverse from front to end
    void traverseFromFront() {
        if (head == null) {
            System.out.println("List is empty.");
            return;
        }
        System.out.print("DLL (Front -> End): ");
        Node temp = head;
        while (temp != null) {
            System.out.print(temp.data + " ");
            temp = temp.next;
        }
        System.out.println();
    }

    // Traverse from end to front
    void traverseFromEnd() {
        if (tail == null) {
            System.out.println("List is empty.");
            return;
        }
        System.out.print("DLL (End -> Front): ");
        Node temp = tail;
        while (temp != null) {
            System.out.print(temp.data + " ");
            temp = temp.prev;
        }
        System.out.println();
    }

    // Insert a node at middle position (middle = size/2, rounded down)
    void insertAtMiddle(int data) {
        if (head == null) {
            insertAtEnd(data);
            System.out.println("List was empty, inserted as first node.");
            return;
        }

        Node newNode = new Node(data);

        // Find middle index
        int size = getSize();
        int mid = size / 2;

        // Traverse to middle node
        Node temp = head;
        for (int i = 0; i < mid; i++) {
            temp = temp.next;
        }

        // Insert newNode before temp
        newNode.prev = temp.prev;
        newNode.next = temp;

        if (temp.prev != null) {
            temp.prev.next = newNode;
        } else {
            head = newNode;  // new node is new head if inserted at front
        }
        temp.prev = newNode;

        System.out.println("Inserted " + data + " at middle position " + mid);
    }

    // Delete node at middle position (middle = size/2, rounded down)
    void deleteAtMiddle() {
        if (head == null) {
            System.out.println("List is empty, nothing to delete.");
            return;
        }

        int size = getSize();
        int mid = size / 2;

        Node temp = head;
        for (int i = 0; i < mid; i++) {
            temp = temp.next;
        }

        // Delete temp node
        if (temp.prev != null) {
            temp.prev.next = temp.next;
        } else {
            // deleting head
            head = temp.next;
        }
        if (temp.next != null) {
            temp.next.prev = temp.prev;
        } else {
            // deleting tail
            tail = temp.prev;
        }

        System.out.println("Deleted node with value " + temp.data + " at middle position " + mid);
    }

    // Get current size of DLL
    int getSize() {
        int count = 0;
        Node temp = head;
        while (temp != null) {
            count++;
            temp = temp.next;
        }
        return count;
    }

    // Menu driven program
    public static void main(String[] args) {
        post4 dll = new post4();
        Scanner sc = new Scanner(System.in);

        while (true) {
            System.out.println("\n--- Doubly Linked List Menu ---");
            System.out.println("1. Build DLL by inserting at end");
            System.out.println("2. Traverse DLL from front");
            System.out.println("3. Traverse DLL from end");
            System.out.println("4. Insert node at middle");
            System.out.println("5. Delete node at middle");
            System.out.println("6. Exit");
            System.out.print("Choose an option: ");

            int choice = sc.nextInt();

            switch (choice) {
                case 1:
                    System.out.print("Enter value to insert at end: ");
                    int val = sc.nextInt();
                    dll.insertAtEnd(val);
                    System.out.println(val + " inserted at end.");
                    break;
                case 2:
                    dll.traverseFromFront();
                    break;
                case 3:
                    dll.traverseFromEnd();
                    break;
                case 4:
                    System.out.print("Enter value to insert at middle: ");
                    int midVal = sc.nextInt();
                    dll.insertAtMiddle(midVal);
                    break;
                case 5:
                    dll.deleteAtMiddle();
                    break;
                case 6:
                    System.out.println("Exiting...");
                    sc.close();
                    return;
                default:
                    System.out.println("Invalid option, try again.");
            }
        }
    }
}


