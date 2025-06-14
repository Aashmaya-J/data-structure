package day8;

import java.util.Arrays;
import java.util.Scanner;

public class task2 {
public static void main(String[] args) {
int []arr= {34,56,2,4,78,90,67,45,12,10};
System.out.println(Arrays.toString(arr));
Arrays.sort(arr);
System.out.println(Arrays.toString(arr));
System.out.println("Enter a value to find its index");
Scanner sc=new Scanner(System.in);
int find=sc.nextInt();
   int left=0;
   int right=arr.length;
   int mid;
   while(left<=right)
   {
    mid=(left+right)/2;
    if(arr[mid]==find)
    {
    System.out.println("Value found "+arr[mid]+ " at index "+mid);
    break;
    }
    else if(find>arr[mid])
    {
    left=mid+1;
    }
    else if(find<arr[mid])
    {
    right=mid-1;
    }
   
   }
}

}
