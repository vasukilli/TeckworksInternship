//6) Write a java program to find sum of all natural numbers between 1 to n.
//sum of all even numbers
import java.util.*;
class SumOfNum
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter num");
        int n = sc.nextInt();
        int i=1 , sum = 0;
        while(i<=n){
            if(i%2 != 0){
            sum += i;//sum=sum+i
            
            }
            i++;
        }
        System.out.println(sum);

    }
}