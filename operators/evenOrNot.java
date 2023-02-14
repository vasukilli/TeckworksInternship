import java.util.Scanner;
public class evenOrNot
  {
    public static void main(String[] args)
    {
      Scanner sc = new Scanner(System.in);
      System.out.println("enter num :");
     // System.out.print("enter a value :");
      int num = sc.nextInt();

    if(num%2 == 0){
      System.out.println(" the number is even");
    }else{
      System.out.println(" the number is odd");
      
    }
  }
}