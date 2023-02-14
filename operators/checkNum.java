import java.util.Scanner;
public class checkNum
  {
    public static void main(String[] args)
    {
      Scanner sc = new Scanner(System.in);
      System.out.println("enter num :");
      System.out.print("enter a value :");
      int num = sc.nextInt();
      
      if(num > 0){
        System.out.println("num is positive");
      }else if(num<0){
        System.out.println("num is negative");
      }else{
        System.out.println("num is zero");
      }
    }
  }