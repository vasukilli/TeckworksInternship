import java.util.*;
class NumberOfUpperAndLower
  {
    public static void display(String str)
    {
      int lowercase=0,uppercase=0;
      for(int i=0;i<=str.length()-1;i++)
        {
          if(str.charAt(i)>='a' && str.charAt(i)<='z')
          {
            lowercase++;
          }
          if(str.charAt(i)>='A' && str.charAt(i)<='Z')
          {
            uppercase++;
          }
        }
      System.out.println("lowercase letters are:"+lowercase);
      System.out.println("uppercase letters are:"+uppercase);
    }

 public static void main(String[] ar)
    {
      Scanner s=new Scanner(System.in);
      System.out.println("enter the string:");
      String s1=s.nextLine();
      display(s1);
    }
  }