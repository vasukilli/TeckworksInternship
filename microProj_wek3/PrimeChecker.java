import java.util.*;
public class  PrimeChecker{

   static int primegenerator(int n) 
  {
  
    for (int i = 2; i < n; i++) {
  
      if (n % i == 0) {
        return 0;
    
      }
    }
    return 1;
    }
  public static void main(String args[]) {
  
    Scanner s=new Scanner(System.in);
     System.out.println("checking prime_number");
    System.out.print("enter the first number:");
    int first=s.nextInt();
     System.out.print("enter the ending limit:");
    int Primelimit=s.nextInt();
    for (int i = first; i <=Primelimit; i++) 
    {
      if (primegenerator(i) == 1)
      {
        System.out.println(i + " ");
      }
    }
  }
}