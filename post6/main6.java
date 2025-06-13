package day6;
public class main6 {
    private int[] arr;
    private int front = 0, rear = -1, size;
    public main6(int capacity) {
        arr = new int[capacity];
        size = capacity;
    }
    public boolean isEmpty() {
        return front > rear;
    }
    public boolean isFull() {
        return rear == size - 1;
    }
    public void enqueue(int val) {
        if (isFull()) {
            System.out.println("Queue full");
            return;
        }
        arr[++rear] = val;
        System.out.println(val + " enqueued");
    }
    public int dequeue() {
        if (isEmpty()) {
            System.out.println("Queue empty");
            return -1;
        }
        return arr[front++];
    }
    public void display() {
        if (isEmpty()) {
            System.out.println("Queue empty");
            return;
        }
        for (int i = front; i <= rear; i++) System.out.print(arr[i] + " ");
        System.out.println();
    }
    public static void main(String[] args) {
        main6 q = new main6(3);
        q.enqueue(1);
        q.enqueue(2);
        q.enqueue(3);
        q.display();
        System.out.println("Dequeued: " + q.dequeue());
        q.display();
    }
}
