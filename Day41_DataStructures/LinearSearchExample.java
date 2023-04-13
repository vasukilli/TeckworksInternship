import java.util.*;

class LinearSearchExample
  {
    public static void main(String[] args)
    {
      Scanner s=new Scanner(System.in);
      System.out.println("enter the array size:");
      int n=s.nextInt();
       System.out.println("enter the element to search:");
      int element=s.nextInt();
      int array[]=new int[n];
      for(int i=0;i<=n-1;i++)
        {
          array[i]=s.nextInt();
        }
      int c=0;
      for(int i=0;i<=array.length-1;i++)
        {
          if(array[i]==element)
          {
            System.out.println(element+"found at"+i);
            c+=1;
            break;
          }
        }
      if(c==0)
        
        {
            System.out.println("element not found");
          }
        
    }
  }