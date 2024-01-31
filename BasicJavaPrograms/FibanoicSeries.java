//Java Program to Find Sum of Fibonacci Series Numbers of First N Even Indexes
// 0,1,1,2,3,5,8,13,21,34....
import java.util.*;
public class FibanoicSeries
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter a number :");
        int n = sc.nextInt();
        int sumOfEven = fibanoicFind(n);
        System.out.println("total of n even indexes places :" + sumOfEven);
    }
    public static int fibanoicFind(int num)
    {
        if(num <= 0)
        {
            return 0;
        }
        int nxt , first = 0 , second = 1 , sum = 0;
        for(int i=0 ; i<=num ; i++)
        {
            if(i % 2 == 0){
            sum = sum + first;
            }
        
        nxt = first + second;
        first = second;
        second  = nxt;
        }
    
    return sum;
}
}
