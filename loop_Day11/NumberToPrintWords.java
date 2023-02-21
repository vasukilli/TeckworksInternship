import java.util.Scanner;
public class NumberToPrintWords
  {
    public static void main(String[] args)
    {
      Scanner sc = new Scanner(System.in);
      System.out.println("enter num");
      int n = sc.nextInt();
      if(n == 1){
        System.out.println("one");
      }
      if(n == 2){
        System.out.println("two");
      }
      if(n == 3){
        System.out.println("three");
      }
      if(n == 4){
        System.out.println("four");
      }
      if(n == 5){
        System.out.println("five");
      }
      if(n == 6){
        System.out.println("six");
      }
      if(n == 7){
        System.out.println("seven");
      }
    }
  }