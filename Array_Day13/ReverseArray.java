import java.util.*;
public class ReverseArray
  {
    public static void reverse(int arr[],int size)
    {
      System.out.println("Reversing elements:");
      for(int i=size-1;i>=0;i--)
        {
          System.out.println(arr[i]);
        }
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
    reverse(array,arraysize);
    }
}