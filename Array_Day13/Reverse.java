mport java.util.Scanner;
public class Reverse
  {
    public static void main(String args[])
    {
      System.out.println("enter array size: ");
      Scanner s=new Scanner(System.in);
      int n=s.nextInt();
      System.out.println("enter array elements");
      int array[]=new int[n];
      int i;
      for(i=0;i<n;i++)
        {
          array[i]=s.nextInt();
        }
      reverse(array,n);
    }
    public static void reverse(int array[],int n)
    {
      int temp=0,k;
      for(int i=0;i<n/2;i++)
        {
         temp=array[i];
         array[i]=array[n-i-1];
         array[n-i-1]=temp;
        }
       System.out.println("Reverse of num: ");
      for(k=0;k<n;k++)
        {
           System.out.println(array[k]);
        }
    }
  }