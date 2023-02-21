import java.util.Scanner;
public class SwapWithoutTemp
  {
    public static void main(String[] args){
      int x,y,z;
      Scanner sc = new Scanner(System.in);
      System.out.println("enter any two values...");
      System.out.println("enter x value : ");
      x = sc.nextInt();
      System.out.println("enter y value : ");
      y = sc.nextInt();

      z=x+y;
      System.out.println("the sum of value : " + z);
      x=z-y;
      y=z-x;
      System.out.println("after swaping x value : " + y);
      System.out.println("after swaping y value : " + x);
      
      
      
    }
  }