package day1;

import java.math.BigInteger;
import java.util.Scanner;

public class task03 {

    public static long fibonacci(int n) {
        if (n == 0) return 0;
        if (n == 1) return 1;
        return fibonacci(n - 1) + fibonacci(n - 2);
    }

    public static BigInteger factorial(BigInteger num) {
        if (num.equals(BigInteger.ZERO) || num.equals(BigInteger.ONE)) {
            return BigInteger.ONE;
        }
        return num.multiply(factorial(num.subtract(BigInteger.ONE)));
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the position (n) to find the nth Fibonacci number: ");
        int n = scanner.nextInt();

        if (n < 0) {
            System.out.println("Please enter a non-negative integer.");
        } else {
            long fib = fibonacci(n);
            System.out.println("Fibonacci number at position " + n + " is " + fib);

            BigInteger fibBig = BigInteger.valueOf(fib);
            BigInteger fact = factorial(fibBig);

            System.out.println("Factorial of Fibonacci number " + fib + " is " + fact);
        }

        scanner.close();
    }
}
