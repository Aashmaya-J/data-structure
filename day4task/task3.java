package day4;
import java.util.Scanner;
public class task3 {
    static class Node {
        int data;
        Node next, prev;
        Node(int data) { this.data = data; }
    }
    private Node head, tail;
    private int size = 0;
    public void insert(int data) {
        Node newNode = new Node(data);
        if (head == null) head = tail = newNode;
        else {
            tail.next = newNode;
            newNode.prev = tail;
            tail = newNode;
        }
        size++;
    }
    public void deleteMiddle() {
        if (head == null) return;
        int mid = size / 2;
        Node curr = head;
        for (int i = 0; i < mid; i++) {
            curr = curr.next;
        }
        if (curr.prev != null)
            curr.prev.next = curr.next;
        else
            head = curr.next;
        if (curr.next != null)
            curr.next.prev = curr.prev;
        else
            tail = curr.prev;
        size--;
    }
    public void traverse() {
        Node curr = head;
        while (curr != null) {
            System.out.print(curr.data + " ");
            curr = curr.next;
        }
        System.out.println();
    }
    public static void main(String[] args) {
        task3 list = new task3();
        Scanner sc = new Scanner(System.in);
        System.out.print("Number of elements: ");
        int n = sc.nextInt();
        for (int i = 0; i < n; i++) {
            list.insert(sc.nextInt());
        }
        System.out.print("List before deleting middle: ");
        list.traverse();
        list.deleteMiddle();
        System.out.print("List after deleting middle: ");
        list.traverse();
        sc.close();
    }
}