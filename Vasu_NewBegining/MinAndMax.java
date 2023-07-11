//2)Program to find the minimum (or maximum) element of an array
import java.util.*;
public class MinAndMax
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
        System.out.println("the min value:" + findMin(arr,n));
        System.out.println("the max value:" + findMax(arr,n));

    }
    public static int findMin(int[] arr,int n)
    {
        int res = arr[0];
        for(int i=1 ; i<n ; i++){
            res = Math.min(res,arr[i]);
        }
        return res;

    }
    public static int findMax(int[] arr,int n)
    {
        int res = arr[0];
        for(int i=1 ; i<n ; i++){
            res = Math.max(res,arr[i]);
        }
        return res;
        
    }
}
