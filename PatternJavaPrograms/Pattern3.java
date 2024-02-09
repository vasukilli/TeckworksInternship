//Java Program to Print Right Triangle Star Pattern
import java.util.*;
public class Pattern3 
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter a value :");
        int n = sc.nextInt();
        printPattern(n);
    }
    public static void printPattern(int n)
    {
        int i , j;
        for(i=1 ; i<=n ; i++)
        {
            for(j=1 ; j<=i; j++)
            {
                System.out.print("* ");
            }
            System.out.println();
        }
    }
    
}
