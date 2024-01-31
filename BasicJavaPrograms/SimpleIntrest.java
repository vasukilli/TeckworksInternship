import java.util.*;
public class SimpleIntrest 
{
   public static void main(String[] args)
   {
    // si = (p*t*r)/100
    Scanner sc = new Scanner(System.in);
    long p = sc.nextLong();
    long t = sc.nextLong();
    long r = sc.nextLong();
    long val = findPTR(p,t,r);
    System.out.println("the ptr value is :" + val);

   } 
   public static long findPTR(long p , long t , long r)
   {
    long val = (p*t*r)/100;
    return val;
   }
}
