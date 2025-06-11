package day5;
import java.util.Scanner;
public class main5<T> {
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
    public boolean deleteNode(T key) {
        if (head == null) {
            return false; 
        }
        Node<T> current = head;
        Node<T> prev = null;
        do {
            if (current.data.equals(key)) {
                break; 
            }
            prev = current;
            current = current.next;
        } while (current != head);
        if (!current.data.equals(key)) {
            return false; 
        }
        if (current == head && current == tail) { 
            head = tail = null;
        } else if (current == head) { 
            head = head.next;
            tail.next = head;
        } else if (current == tail) { 
            tail = prev;
            tail.next = head;
        } else { 
            prev.next = current.next;
        }
        return true;
    }
    public static void main(String[] args) {
        main5<String> list = new main5<>();
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
        System.out.println("Enter the element to delete:");
        String elementToDelete = scanner.nextLine();
        boolean deleted = list.deleteNode(elementToDelete);
        if (deleted) {
            System.out.println("Node with value '" + elementToDelete + "' deleted.");
        } else {
            System.out.println("Node with value '" + elementToDelete + "' not found.");
        }
        System.out.println("Circular Linked List:");
        list.display();
        scanner.close();
    }
}
