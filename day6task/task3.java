package day6;
public class task3<T> {
    private static class Node<T> {
        T data;
        Node<T> next;
        Node(T data) { this.data = data; }
    }
    private Node<T> front, rear;

    public void enqueue(T item) {
        Node<T> newNode = new Node<>(item);
        if (rear != null) rear.next = newNode;
        rear = newNode;
        if (front == null) front = rear;
    }
    public T dequeue() {
        if (front == null) throw new IllegalStateException("Queue empty");
        T data = front.data;
        front = front.next;
        if (front == null) rear = null;
        return data;
    }
    public static void main(String[] args) {
        task3<Integer> q = new task3<>();
        q.enqueue(1);
        q.enqueue(2);
        q.enqueue(3);
        System.out.println(q.dequeue());
        System.out.println(q.dequeue());
        System.out.println(q.dequeue());
    }
}
