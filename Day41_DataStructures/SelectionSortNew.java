import java.util.*;
class SelectionSort
  {
    public static void selectionsort(int arr[],int n)
    {
      int t;
      for(int i=0;i<n;i++)
        {
          for(int j=i+1;j<n;j++)
            {
              if(arr[i]>arr[j])
              {
                t=arr[i];
                arr[i]=arr[j];
                arr[j]=t;
              }
            }
        }
      for(int k=0;k<=n-1;k++)
        {
          System.out.println(arr[k]);
        }
    }
public static void main(String[] args)
    {
      Scanner s=new Scanner(System.in);
      System.out.println("enter the array size:");
      int n=s.nextInt();
      System.out.println("enter the array elements:"); 
      int array[]=new int[n];
      for(int i=0;i<=n-1;i++)
        {
          array[i]=s.nextInt();
        }
   selectionsort(array,n);
    }
}