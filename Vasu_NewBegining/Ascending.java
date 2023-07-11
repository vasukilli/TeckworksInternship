// program to sort an array in ascending order
import java.util.*;
public class Ascending{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter array size:");
        int n=sc.nextInt();
        int[] arr = new int[n];
        for(int i=0 ; i<n ; i++){
            arr[i] = sc.nextInt();
            System.out.print(arr[i] + " ");
        }
        bobbleSort(arr,n);
        printArray(arr,n);
    }
    public static void bobbleSort(int[] arr , int n){
        for(int i=0 ; i<n-1 ; i++)
        {
            for(int j=0 ; j<n-i-1 ; j++)
            {
                 if(arr[j]>arr[j+1]){
                    int temp = arr[j];
                    arr[j]=arr[j+1];
                    arr[j+1]=temp;
                }
            }
               
        }
    }
    public static void printArray(int[] arr , int n)
    {
        for(int a : arr){
            System.out.println(a + " ");
        }
    }
}
   
