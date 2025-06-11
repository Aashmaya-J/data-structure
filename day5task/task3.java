package day5;
import java.util.Scanner;
public class task3<T> {
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
        if (head == null) {
            System.out.println("Empty");
            return;
        }
        Node<T> current = head;
        do {
            System.out.print(current.data + " ");
            current = current.next;
        } while (current != head);
        System.out.println();
    }
    public void deleteHead() {
        if (head == null) {
            return; 
        }
        if (head == tail) { 
            head = tail = null;
            return;
        }
        head = head.next;
        tail.next = head; 
    }
    public static void main(String[] args) {
        task3<String> list = new task3<>();
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
        System.out.println("Delete from head? (yes/no)");
        String deleteChoice = scanner.nextLine();

        if (deleteChoice.equalsIgnoreCase("yes")) {
            list.deleteHead();
            System.out.println("Head deleted.");
        } else {
            System.out.println("No deletion performed.");
        }
        System.out.println("Circular Linked List:");
        list.display();
        scanner.close();
    }
}
