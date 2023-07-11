//Sort an array of 0s, 1s and 2s | Dutch National Flag problem
import java.util.*;
public class SortNums 
{
   public static void main(String[] args)
   {
     Scanner sc = new Scanner(System.in);
     System.out.println("ENTER THE ARRAY SIZE:");
     int n = sc.nextInt();
     int[] arr = new int[n];
     System.out.println("enter the array elements:");
     for(int i=0 ; i<n ; i++)
    {
        arr[i] = sc.nextInt();
        System.out.print(arr[i] + " ");
    }
    displayArray(arr,n);
    }
    public static void displayArray(int[] arr , int n)
    {
        int start = 0 , end = n-1;
        for(int i=0 ; i<n;i++){
            for(int j=i+1 ; j<n ; j++){
                if(arr[i]==arr[j]){
                    arr[i+1]=arr[j];
                    start++;
                    end--;
                }
            }
        }
        for(int a : arr){
            System.out.print(a + ",");
        }
    }

}
