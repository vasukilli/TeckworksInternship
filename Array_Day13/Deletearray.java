import java.util.*;
public class Deletearray
  {
    public static void deleteElement(int arr[],int size)
    {
      Scanner s=new Scanner(System.in);
      System.out.println("enter the index you want to delete:");
     int index=s.nextInt();
      for(int i=index;i<size-1;i++)
        {
          arr[i]=arr[i+1];
        }
      System.out.println("new Array is:");
      for(int j=0;j<size-1;j++)
        {
        System.out.println(arr[j]);
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
    deleteElement(array,arraysize);
    }
  }
