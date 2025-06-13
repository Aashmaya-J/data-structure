package day6;
public class post6 {
    private static class Node {
        int val;
        Node next;
        Node(int v) { val = v; }
    }
    private Node head;

    public void push(int val) {
        Node n = new Node(val);
        n.next = head;
        head = n;
    }
    public int pop() {
        if (head == null) throw new RuntimeException("Stack is empty");
        int val = head.val;
        head = head.next;
        return val;
    }
    public int peek() {
        if (head == null) throw new RuntimeException("Stack is empty");
        return head.val;
    }
    public boolean isEmpty() {
        return head == null;
    }
    public static void main(String[] args) {
        post6 s = new post6();
        s.push(10);
        s.push(20);
        System.out.println(s.peek());
        System.out.println(s.pop());
        System.out.println(s.pop());
        System.out.println(s.isEmpty());
    }
}
