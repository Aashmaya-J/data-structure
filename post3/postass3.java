package day3;
import java.util.Scanner;
import java.util.Stack;

public class postass3 {
    public static int evaluatePostfix(String expr) {
        Stack<Integer> stack = new Stack<>();

        for (char ch : expr.toCharArray()) {
            if (Character.isDigit(ch)) {
                stack.push(ch - '0');
            } else {
                int b = stack.pop();
                int a = stack.pop();
                switch (ch) {
                    case '+' -> stack.push(a + b);
                    case '-' -> stack.push(a - b);
                    case '*' -> stack.push(a * b);
                    case '/' -> stack.push(a / b);
                    default -> throw new IllegalArgumentException("Invalid operator: " + ch);
                }
            }
        }

        return stack.pop();
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter postfix expression (e.g., 53+82-*): ");
        String postfix = sc.nextLine();
        try {
            int result = evaluatePostfix(postfix);
            System.out.println("Result: " + result);
        } catch (Exception e) {
            System.out.println("Invalid postfix expression: " + e.getMessage());
        }
        sc.close();
    }
}
