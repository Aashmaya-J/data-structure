package day6;
import java.util.*;
public class task2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] stack = new int[5];
        int top = -1;
        while (true){
            System.out.print("\n1.Push 2.Pop 3.Peek 4.Display 5.Exit\nChoice: ");
            switch (sc.nextInt()) {
                case 1 -> {
                    if (top == 4) System.out.println("Overflow!");
                    else {
                        System.out.print("Enter value: ");
                        stack[++top] = sc.nextInt();
                    }
                }
                case 2 -> System.out.println(top == -1 ? "Underflow!" : stack[top--] + " popped.");
                case 3 -> System.out.println(top == -1 ? "Empty" : "Top: " + stack[top]);
                case 4 -> {
                    if (top == -1) System.out.println("Empty");
                    else for (int i = top; i >= 0; i--) System.out.print(stack[i] + " ");
                    System.out.println();
                }
                case 5 -> { System.out.println("Bye!"); return; }
                default -> System.out.println("Invalid!");
            }
    }
    }
}



































