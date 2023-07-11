import java.util.*;
class position
  {
    public static void main(String arg[])
    {
      Scanner s=new Scanner(System.in);
      System.out.println("enter array size");
      int n=s.nextInt();

      int i;
      System.out.println("enter add element");
      int ele=s.nextInt();
      int pos=s.nextInt();
      int arr1[]=new int[n];

      System.out.println("enter array elements");
      for(i=0;i<n;i++)
        {
          arr1[i]=s.nextInt();
        }
      int arr2[]=new int[n+1];
      for(i=0;i<n+1;i++)
        {
          if(pos>i)
          {
          arr2[i]=arr1[i];
          }
          else if(pos==i)
          {
            arr2[i]=ele;
          }
          else
          {
            arr2[i]=arr1[i-1];
          }
        }
      for(i=0;i<n+1;i++)
        {
          System.out.println(arr2[i]);
        }


        }
    }