import java.util.Scanner;
class Sqrt
  {
    public static void main(String[] args)
    {
      Scanner sc = new Scanner(System.in);
      System.out.println("enter any number:");
      double n = sc.nextDouble();
      //double sqrt =(double)Math.sqrt(n);
      try{
        System.out.println(Math.sqrt(n));
      }
      catch(Exception e)
        {
          System.out.println(e);
        }
      finally{
        System.out.println("program execution completed");
      }
    }
  }