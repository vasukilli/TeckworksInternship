import java.util.*;
public class BubbleSort
  {
    public static void main(String[] args)
    {
      Scanner sc = new Scanner(System.in);
      System.out.println("enter array size");
      int n = sc.nextInt();
      int[] arr = new int[n];
      for(int i=0;i<n;i++)
      {
        arr[i] = sc.nextInt();
        System.out.print(arr[i] + " ");
      }
      int[] temp = display(arr,n);
      {
        for(int i=0;i<temp.length;i++){
          System.out.println(temp[i]);
        }
      }
    }
    public static int[] display(int[] arr , int n){
      int temp[] = new int[n];

      for(int i=0;i<arr.length;i++){
        for(int j=i+1;j<arr.length;j++){
          if(arr[i] > arr[j])
          {
              temp[i] = arr[j];
            arr[j] = arr[i];
            temp[i] = arr[j];
          }
        }
        return temp[];
      }
      
    }
  }