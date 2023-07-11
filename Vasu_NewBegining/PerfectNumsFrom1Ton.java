//30) Write a java program to print all Perfect numbers between 1 to n.
import java.util.*;
public class PerfectNumsFrom1Ton 
{
  public static void main(String[] arfs)
  {
    Scanner sc = new Scanner(System.in);
    System.out.println("enter the range you want to find perfect numbers");
    int n = sc.nextInt();
    for(int i=1 ; i<=n ; i++)
    {
        if(isPerfectNum(i))
        {
            System.out.println(i);
        }
    }   
   }
   public static boolean isPerfectNum(int num)
   {
    int sum = 0;
    for(int i=1 ; i<num/2 ; i++)
    {
        if(num%i==0){
            sum=sum+i;
        }
    }
    return (sum==num);
   }
}
