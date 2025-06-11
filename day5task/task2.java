package day5;
import java.util.Scanner;
public class task2<T> {
    private Node<T> head, tail;
    private static class Node<T> {
        T data;
        Node<T> next;
        Node(T data) { this.data = data; }
    }
    public void add(T data) {
        Node<T> newNode = new Node<>(data);
        if (head == null) {
            head = tail = newNode;
            newNode.next = head;
        } else {
            tail.next = newNode;
            newNode.next = head;
            tail = newNode;
        }
    }
    public void display() {
        if (head == null) { System.out.println("Empty"); return; }
        Node<T> current = head;
        do {
            System.out.print(current.data + " ");
            current = current.next;
        } while (current != head);
        System.out.println();
    }
    public static void main(String[] args) {
        task2<String> list = new task2<>();
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter initial elements (type 'done' to finish):");
        String input;
        while (true) {
            input = scanner.nextLine();
            if (input.equalsIgnoreCase("done")) {
                break;
            }
            list.add(input);
        }
        System.out.println("Enter the element to insert at the tail:");
        String tailElement = scanner.nextLine();
        list.add(tailElement); 
        System.out.println("Circular Linked List:");
        list.display();
        scanner.close();
    }
}
