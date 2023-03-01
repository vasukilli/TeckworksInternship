import java.util.*;
public class SecondMaxMin
  {
    public static void Secondsmallest(int arr[],int s)
    {
      int min=arr[0],min2=arr[0];
          for(int j=1;j<=s-1;j++)
            {
              if(min>arr[j])
              {
                min=arr[j];
              }
              if(min2>arr[j] && arr[j]!=min)
              {
                min2=arr[j];
              }
           }
      System.out.println("Second smallest element:"+min2);
    }
    public static void Secondlargest(int arr[],int s)
    { 
       int max=arr[0],max2=arr[0];
          for(int j=1;j<=s-1;j++)
            {
              if(max<arr[j])
              {
                max=arr[j];
              }
              if(max2<arr[j] && arr[j]!=max)
              {
                max2=arr[j];
              }
           }
      System.out.println("Second largest element:"+max2);
    }


 public static void main(String[] ar)
    {
      Scanner s=new Scanner(System.in);
    System.out.print("enter the array size:");
    int arraysize=s.nextInt();
    int array[]=new int[arraysize];
      System.out.print("enter the array elemnts:");
      for(int i=0;i<array.length;i++)
      {
        array[i]=s.nextInt();
      }
    Secondsmallest(array,arraysize);
     Secondlargest(array,arraysize); 
    }
}