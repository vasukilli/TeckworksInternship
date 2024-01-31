//Java Program to Check If a Number is Neon Number or Not
import java.util.*;
public class NeonNumber2 
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        if(isNeon(num))
        {
            System.out.println("The number is " + num + " neon number");
        }else{
            System.out.println("The number is " + num + " not neon number");
        }

    }
    public static boolean isNeon(int num)
    {
        int square = num * num ;
        int sum = 0 , remainder;
        while(square > 0)
        {
            remainder = square %10;
            sum = sum + remainder;
            square = square/10;
        }
        if(sum == num){
            return true;
        }else{
            return false;
        }
    }
    
}
