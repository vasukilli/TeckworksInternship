import java.util.Scanner;
public class maxNum3
  {
    public static void main(String[] args)
    {
      Scanner sc = new Scanner(System.in);
      System.out.println("enter three values :");
      System.out.print("enter a value :");
      int a = sc.nextInt();
      System.out.print("enter b value :");
      int b = sc.nextInt();
      System.out.print("enter c value :");
      int c = sc.nextInt();
      if(a>b){
        System.out.println("a is max number");
      }else if(b>c){
        System.out.println("b is max number");
      }else{
        System.out.println("c is max number");
      }
    }
  }