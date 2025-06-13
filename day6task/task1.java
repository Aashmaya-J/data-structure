package day6;
import java.util.Scanner;
public class task1 {
    int[] stack;
    int top = -1;
    task1(int size) {
        stack = new int[size];
    }
    void push(int val) {
        if (top == stack.length - 1)
            System.out.println("Stack overflow!");
        else {
            stack[++top] = val;
            System.out.println(val + " pushed.");
            print();
        }
    }
    void pop() {
        if (top == -1)
            System.out.println("Stack underflow!");
        else {
            System.out.println(stack[top--] + " popped.");
            print();
        }
    }
    void print() {
        if (top == -1)
            System.out.println("Stack is empty.");
        else {
            System.out.print("Stack: ");
            for (int i = 0; i <= top; i++)
                System.out.print(stack[i] + " ");
            System.out.println();
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter stack size: ");
        task1 s = new task1(sc.nextInt());
        while (true) {
            System.out.print("\n1.Push  2.Pop  3.Exit\nChoose: ");
            int ch = sc.nextInt();
            if (ch == 1) {
                System.out.print("Enter value: ");
                s.push(sc.nextInt());
            } else if (ch == 2) {
                s.pop();
            } else if (ch == 3) {
                System.out.println("Bye!");
                break;
            } else {
                System.out.println("Invalid!");
            }
        }
        sc.close();
    }
}

