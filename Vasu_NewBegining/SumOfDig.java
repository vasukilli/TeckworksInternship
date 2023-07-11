//14) Write a java program to calculate sum of digits of a number.
import java.util.*;
public class SumOfDig 
{
   public static void main(String[] args)
   {
    Scanner sc = new Scanner(System.in);
    int n=sc.nextInt();
    int mul = 1;
    if(n < 0){
        System.out.println("..");
    }else{
    while(n != 0){
       int dig=n%10;
       mul=mul*dig;
       n=n/10;
    }

    System.out.println("the mul :" + mul);
   } 
}
}
