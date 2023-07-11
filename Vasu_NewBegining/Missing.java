// Find the Missing Number

import java.util.Scanner;

public class Missing 
{
    public static void main(String[] args)
    {
     Scanner sc = new Scanner(System.in);
     System.out.println("enter the number of elements in array:");
    int n = sc.nextInt();
    int[] arr = new int[n];
    System.out.println("enter aray elements:");
    for(int i=0 ; i<n ; i++)
    {
        arr[i]=sc.nextInt();
        System.out.print(arr[i] + " ");
    }
     System.out.println("enter the number of elements:");
     int x = sc.nextInt();
     int val = x*(x+1)/2;
     int count = 0;
     for(int i=0 ;i<arr.length ; i++){
        count = count+arr[i];
    }
    System.out.println("the missing num is :" + (val-count));



    }
}
