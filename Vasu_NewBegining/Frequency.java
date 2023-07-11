//Count number of occurrences (or frequency) in a sorted array
import java.util.*;
public class Frequency 
{
   public static void main(String[] args)
   {
     Scanner sc = new Scanner(System.in);
     System.out.println("ENTER THE ARRAY SIZE:");
     int n = sc.nextInt();
     System.out.println("enter the element:");
     int k = sc.nextInt();
     int[] arr = new int[n];
     System.out.println("enter the array elements:");
     for(int i=0 ; i<n ; i++)
    {
        arr[i] = sc.nextInt();
        System.out.print(arr[i] + " ");
    }
    int fre = findTheFreq(arr,n,k);
    System.out.println("the frequency is :" + fre);
   }
   public static int findTheFreq(int[] arr , int n , int k)
   {
    int fre = 0;
    for(int i=0 ; i<n ; i++){
        if(arr[i]==k){
            fre++;
        }
    }
    return fre;
   }
}