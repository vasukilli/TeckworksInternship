//32) Write a java program to print all Strong numbers between 1 to n.
import java.util.Scanner;
public class StrongNumberBwN
{
    public static void main(String[] arfs)
    {
      Scanner sc = new Scanner(System.in);
      System.out.println("enter end of element:");
      int n = sc.nextInt();
      for(int i=1 ; i<=n ; i++){
        if(isStrongNum(i))
        {
            System.out.println(i);
        }
      }
    }
    public static boolean isStrongNum(int num)
    {
        int sum = 0;
        int temp = num;
        while(temp != 0){
            int dig = temp%10;
            sum = sum+factorial(dig);
            temp = temp/10;
        }
        return sum==num;
    }
    public static int factorial(int dig)
    {
        int fact = 1;
        for(int i=1;i<=dig;i++){
            fact = fact*i;
        }
        return fact;
    }
}
