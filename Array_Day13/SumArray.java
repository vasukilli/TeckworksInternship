import java.util.*;
public class SumArray
  {
    public static void sum(int arr[],int size)
    {
      int sum=0;
      for(int i=0;i<size-1;i++)
        {
          sum=sum+arr[i];
        }
      System.out.println("Sum of array elements is:"+sum);
    }

public static void main(String[] r)
    {
    Scanner s=new Scanner(System.in);
    int arraysize=s.nextInt();
      System.out.print("enter the size:");
    int array[]=new int[arraysize];
      System.out.print("enter the array elemnts:");
    for(int i=0;i<array.length;i++)
      {
        array[i]=s.nextInt();
      }
    sum(array,arraysize);
    }
}