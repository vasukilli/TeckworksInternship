import java.util.*;
class ArrayCombination
  {
    public static void displayArray(int arr[],int s)
    {
      int count0=0,count2=0,count1=0;
      for(int i=0;i<=s-1;i++)
        {
         if(arr[i]==0)
         {
           count0++;
         }
        if(arr[i]==2)
            {
            count2++;
            }
          if(arr[i]==1)
          {
            count1++;
          }
        }
      for(int i=0;i<count0;i++)
        {
          arr[i]=0;
        }
       for(int i=count0;i<count0+count2;i++)
        {
          arr[i]=2;
        }
      for(int i=count2+count1;i<s;i++)
        {
          arr[i]=1;
        }
      
      for(int i=0;i<=s-1;i++)
        {
          System.out.print(arr[i]+" ");
        }
         
      }
    public static void main(String[] args)
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
    displayArray(array,arraysize);
    }
}