import java.util.Scanner;
public class program2
  {
    public static void main(String[] args){
      Scanner sc = new Scanner(System.in);
      System.out.println("enter number of elements:");
      int n=sc.nextInt();
      System.out.println("enter number of elements to shift:");
      int m=sc.nextInt();
      int arr[] = new int[n];
      int temp[] = new int[m];
      System.out.println("enter array elements:");
      for(int i=0;i<n;i++){
        arr[i] = sc.nextInt();
      }
      displayArray(arr,temp,n,m);
    }
    public static void displayArray(int[] arr,int[] temp,int n,int m)    {
      for(int i=0;i<m;i++){
        temp[i] = arr[i];
      }
      for(int i=m;i<n;i++){
        arr[i-m] = arr[i];
      }
      for(int i=0;i<m;i++){
        arr[i+n-m] = temp[i];
      }
      System.out.println("array after shifting:");
      for(int i=0;i<arr.length;i++){
        System.out.println(arr[i]);
      }
      
      
    }
  }