package day8;

import java.util.Arrays;

import java.util.Scanner;

public class task1 {
	public static void main(String[] args) {
		int arr[] = { 12, 3, 5, 67, 1, 90, 34 };
		System.out.println(Arrays.toString(arr));
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the value to find");
		int find = sc.nextInt();
		boolean flag = false;
		for (int i = 0; i < arr.length; i++)
		{
			if (arr[i] == find)
			{
				System.out.println("value found:" + arr[i] + " at index " + i);

				flag = true;

				break;
		  }
		}
		if (flag == false)
		{
			System.out.println("Value not found");
		}
	}
}