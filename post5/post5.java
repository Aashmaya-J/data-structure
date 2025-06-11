package day5;
import java.util.Scanner;
public class post5 {
    private Node head, tail;
    private class Node {
        String data;
        Node next;
        Node(String d) { data = d; }
    }
    void insertTail(String d) {
        Node n = new Node(d);
        if (head == null) {
            head = tail = n;
            n.next = head;
        } else {
            tail.next = n;
            n.next = head;
            tail = n;
        }
    }
    boolean deleteHead() {
        if (head == null) return false;
        if (head == tail) head = tail = null;
        else {
            head = head.next;
            tail.next = head;
        }
        return true;
    }
    void display() {
        if (head == null) { System.out.println("Empty List"); return; }
        Node cur = head;
        do {
            System.out.print(cur.data + " ");
            cur = cur.next;
        } while (cur != head);
        System.out.println();
    }
    public static void main(String[] args) {
        post5 cll = new post5();
        Scanner sc = new Scanner(System.in);
        String choice;
        do {
            System.out.println("\n1. Insert Tail  2. Delete Head  3. Display  4. Exit");
            System.out.print("Choice: ");
            choice = sc.nextLine();
            switch (choice) {
                case "1":
                    System.out.print("Value to insert: ");
                    cll.insertTail(sc.nextLine());
                    break;
                case "2":
                    if (!cll.deleteHead()) System.out.println("List empty");
                    else System.out.println("Head deleted");
                    break;
                case "3":
                    cll.display();
                    break;
                case "4":
                    System.out.println("Exiting...");
                    break;
                default:
                    System.out.println("Invalid input");
            }
        } while (!choice.equals("4"));
        sc.close();
    }
}
