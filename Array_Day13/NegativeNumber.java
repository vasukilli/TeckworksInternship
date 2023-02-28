import java.util.*;
public class NegativeNumber
  {
    public static void negative(int arr[],int size)
    {
      int count=0;
      for(int i=0;i<=size-1;i++)
        {
          if(arr[i]<0)
          {
            count++;
          }
        }
      System.out.println("negative numbers are:"+count);
    }
public static void main(String[] r)
    {
    Scanner s=new Scanner(System.in);
       System.out.print("enter the size:");
    int arraysize=s.nextInt();
    int array[]=new int[arraysize];
      System.out.print("enter the array elemnts:");
      for(int i=0;i<array.length;i++)
      {
        array[i]=s.nextInt();
      }
    negative(array,arraysize);
    }
}