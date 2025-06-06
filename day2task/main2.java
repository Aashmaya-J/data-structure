package day2; 
import java.util.Scanner;

public class main2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("=== Palindrome Checker (Two Pointer) ===");
        System.out.println();

        System.out.print("Enter a string : ");
        String input = scanner.nextLine();

        boolean isPalindrome = checkPalindrome(input);

        if (isPalindrome) {
            System.out.println("The input is a palindrome.");
        } else {
            System.out.println("The input is NOT a palindrome.");
        }

        scanner.close();
    }

    private static boolean checkPalindrome(String str) {
        int left = 0;
        int right = str.length() - 1;

        while (left < right) {
            while (left < right && !Character.isLetterOrDigit(str.charAt(left))) {
                left++;
            }
            while (left < right && !Character.isLetterOrDigit(str.charAt(right))) {
                right--;
            }

            if (Character.toLowerCase(str.charAt(left)) != Character.toLowerCase(str.charAt(right))) {
                return false;
            }
            left++;
            right--;
        }
        return true;
    }
}



