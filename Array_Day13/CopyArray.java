import java.util.*;
public class  CopyArray
  {
    public static void copy(int arr[],int size)
    {
      int array2[]=new int[size];
      for(int i=0;i<=size-1;i++)
        {
          array2[i]=arr[i];
        }
      System.out.println("array2 is:");
       for(int j=0;j<=size-1;j++)
         {
           
           System.out.println(array2[j]);
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
    copy(array,arraysize);
    }
}