//3)Write a program to reverse an array or string
import java.util.*;
public class Reverse1
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter size:");
        int n = sc.nextInt();
        int[] arr = new int[n];
        for(int i=0 ; i<arr.length ;i++)
        {
            arr[i] = sc.nextInt();
        }
       
        findReverse(arr,n);
        printReverse(arr,n);

    }
    public static void findReverse(int[] arr, int n)
    {
       int start =0 , end = n-1;
       int temp ;
       while(start < end)
       {
        temp = arr[start];
        arr[start]=arr[end];
        arr[end] = temp;
        start++;
        end--;
       }

    }
    public static void printReverse(int[] arr,int n)
    {
        for(int i=0 ; i<arr.length ;i++){
            System.out.print(arr[i] + " ");
        }
    }
}