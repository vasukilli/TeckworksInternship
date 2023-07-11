//11) Write a java program to find first and last digit of a number.
import java.util.*;
public class FindFirstAndLast 
{
   public static void main(String[] args)
   {
    Scanner sc = new Scanner(System.in);
    int n=sc.nextInt();
    int first = firstNum(n);
    System.out.println(first);
    int last = lastNum(n);
    System.out.println(last);
    int total = first + last;
    System.out.println(total);

   }
   public static int firstNum(int n){
     while(n >= 10){
        n=n/10;
     }
     return n;
   }
   public static int lastNum(int n){
    
    return n%10;
  }

}
