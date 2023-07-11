//Write a java program to check whether a number is Armstrong number or not.
import java.util.*;
public class ArmstrongNumber
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter number");
        int num = sc.nextInt();
        if(isArmstrongNum(num))
        {
            System.out.println(num + " is armstrong number");
        }else{
            System.out.println(num + " is not armstrong number");
        }
    }
    public static boolean isArmstrongNum(int num)
    {
        int temp = num;
        int sum = 0;
        while(num != 0){
            int dig = num%10;
            sum=(int)(sum+Math.pow(dig,powervalue(num)));//power
            num = num/10;
        }
        return temp==sum;

    }
    public static int powervalue(int num)
    {
        int count=0;
        while(num!=0){
            num=num/10;
            count++;
        }
        return count;
    }
}