import java.util.*;
public class QuadraticEqua
  {
    public static void main(String[] args)
    {
      Scanner sc = new Scanner(System.in);
      System.out.println("enter a :");
      double a = sc.nextDouble();
       System.out.println("enter b :");
      double b = sc.nextDouble();
       System.out.println("enter c :");
      double c = sc.nextDouble();

      double d = (b*b - 4*a*c);
      if(d>0){
        double r1 = (-b + Math.sqrt(d))/2*a;
        double r2 = (-b + Math.sqrt(d))/2*a;
        Syystem.out.println("the roots are " + r1 +"and" + r2);
        
      }else if(d==0){
        r1 = -b/2*a;
        System.out.println("the root is " + r1);
      }else{
        System.out.println("the roots are invalid");
      }
    }
  }