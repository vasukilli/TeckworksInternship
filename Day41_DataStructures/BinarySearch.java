import java.util.*;
public class BinarySearch
  {
    public static void main(String[] args)
    {
      Scanner sc = new Scanner(System.in);
      System.out.println("enter array size");
      int n = sc.nextInt();
      System.out.println("enter key value");
      int k = sc.nextInt();
      int[] arr = new int[n];
      for(int i=0;i<n;i++)
      {
        arr[i] = sc.nextInt();
        System.out.print(arr[i] + " ");
      }
      int res = display(arr,n,k);
      System.out.println(res);
    }
    public static int display(int[] arr , int n,int k)
    {
      for(int i=0;i<n;i++){
        int mid = (arr[i] + arr[n-1])/2;
        if(k >arr[mid]){
          
        }else if(k <arr[mid]){
          
        }else{
          
        }
      }
    }
  }