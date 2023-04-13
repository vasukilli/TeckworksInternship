import java.util.*;
class Bubblesort
  {
    public static void bubblesort(int arr[],int n)
    {
      int t;
      for(int i=0;i<n-1;i++)
        {
          for(int j=0;j<n-1;j++)
            {
              if(arr[j]>arr[j+1])
              {
                t=arr[j];
                arr[j]=arr[j+1];
                arr[j+1]=t;
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
   bubblesort(array,n);
}
}