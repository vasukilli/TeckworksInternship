import java.util.*;
public class Pattern4 
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter number :");
        int n = sc.nextInt();
        printPattern(n);
    }
    public static void printPattern(int n)
    {
        for(int i=1 ; i<=n ; i++)
        {
            for(int j = n ; j>=i ; j--)
            {
                System.out.print("* ");
            }
            System.out.println();
        }
    }
    
}
