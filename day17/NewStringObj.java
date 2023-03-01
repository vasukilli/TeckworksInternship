import java.util.*;
class NewStringObj
  {
    public static void display(char c[])
    {
      String str=new String(c);
      System.out.println(str);
    }

 public static void main(String[] ar)
    {
      Scanner s=new Scanner(System.in);
      System.out.println("enter number of characters:");
      int n=s.nextInt();
      char c[]=new char[n];
      for(int i=0;i<n;i++)
        {
          c[i]=s.next().charAt(0);
        }
      display(c);
    }
  }