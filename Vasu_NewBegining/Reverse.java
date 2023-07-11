//16) Write a java program to enter a number and print its reverse.
import java.util.*;
public class Reverse 
{
   public static void main(String[] aegs)
   {
    Scanner sc = new Scanner(System.in);
    int n=sc.nextInt();
    int reverse_num = 0;
    if(n>=0){
         while(n != 0){
            int dig = n%10;
            reverse_num = reverse_num*10 + dig;
            n /= 10;
        }
        System.out.println("reverse" + reverse_num);
    }else{
        System.out.println("Go to hell dear"); 
    }
   } 
}
