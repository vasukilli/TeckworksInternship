import java.util.Scanner;
public class maxNum
  {
    public static void main(String[] args)
    {
      Scanner sc = new Scanner(System.in);
      System.out.println("enter two values :");
      System.out.print("enter a value :");
      int a = sc.nextInt();
      System.out.print("enter b value :");
      int b = sc.nextInt();
      if(a>b){
        System.out.println("a is max number");
      }else{
        System.out.println("b is max number");
      }
    }
  }