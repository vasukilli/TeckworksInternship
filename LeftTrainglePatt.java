//Java Program to Print Left Triangle Star Pattern
import java.util.*;
public class LeftTrainglePatt 
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter any number :");
        int n = sc.nextInt();
        printLeftPattern(n);
    }
    public static void printLeftPattern(int n)
    {
        for(int i=1 ; i<=n ; i++)
        {
            for(int j=n-1 ;j>=i;j--)
            {
                System.out.print(" ");
            }
            for(int k=1 ; k<=i;k++)
            {
                System.out.print("*");
            }
            System.out.println();
        }
    }
    
}
