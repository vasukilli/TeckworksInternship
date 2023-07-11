//K’th Smallest/Largest Element in Unsorted Array
import java.util.*;
public class KthSmallest 
{
   public static void main(String[] args)
   {
     Scanner sc = new Scanner(System.in);
     System.out.println("ENTER THE ARRAY SIZE:");
     int n = sc.nextInt();
     System.out.println("enter the kth element:");
     int k = sc.nextInt();
     int[] arr = new int[n];
     System.out.println("enter the array elements:");
     for(int i=0 ; i<n ; i++)
    {
        arr[i] = sc.nextInt();
        System.out.print(arr[i] + " ");
    }
    findKthElement(arr,n,k);
   }
   public static void findKthElement(int[] arr,int n , int k)
   {
    //sort the array first
    int temp = 0;
    for(int i=0 ; i<n ; i++){
        for(int j=i+1 ; j<n ; j++){
            if(arr[i]>arr[j]){
                temp=arr[i];
                arr[i]=arr[j];
                arr[j]=temp;
            }
        }
    }
    // System.out.println("the kth smallest element is :" + arr[k-1]);
    System.out.println();
    for(int a : arr){
        System.out.print(a + ",");
    }
    System.out.println("the kth smallest element is :" + arr[k-1]);
   }
}
