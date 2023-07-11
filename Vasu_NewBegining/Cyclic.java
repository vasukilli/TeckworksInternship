//Program to cyclically rotate an array by one
import java.util.Arrays;
import java.util.*;
public class Cyclic
{
   public static void main(String[] args)
   {
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();
    int[] arr = new int[n];
    for(int i=0 ; i<n ; i++){
        arr[i]=sc.nextInt();
        System.out.print(arr[i] + " ");
    }
    int x = arr[arr.length-1];
    for(int i=arr.length-1;i>0;i--)
    {
        arr[i]=arr[i-1];
        // arr[0]=x;
    }
    arr[0]=x;
    System.out.println("after cycling");
    for(int i=0 ; i<n ; i++){
       
        System.out.print(arr[i] + " ");
    }

   }
}