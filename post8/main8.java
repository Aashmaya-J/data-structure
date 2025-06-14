package day8;



import java.util.Scanner;



public class main8 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);



        System.out.print("Enter number of elements: ");

        int n = Integer.parseInt(sc.nextLine());

        String[] arr = new String[n];



        System.out.println("Enter the rotated sorted array:");

        for (int i = 0; i < n; i++) {

            arr[i] = sc.nextLine();

        }



        System.out.print("Enter the target to search: ");

        String target = sc.nextLine();



        int index = search(arr, target);



        if (index != -1)

            System.out.println("Target found at index: " + index);

        else

            System.out.println("Target not found.");



        sc.close();

    }

    static int search(String[] arr, String target) {

        int left = 0, right = arr.length - 1;



        while (left <= right) {

            int mid = (left + right) / 2;



            if (arr[mid].equals(target))

                return mid;



            if (arr[left].compareTo(arr[mid]) <= 0) {

                if (arr[left].compareTo(target) <= 0 && target.compareTo(arr[mid]) < 0)

                    right = mid - 1;

                else

                    left = mid + 1;

            } else {

                if (arr[mid].compareTo(target) < 0 && target.compareTo(arr[right]) <= 0)

                    left = mid + 1;

                else

                    right = mid - 1;

            }

        }

        return -1;

    }

}