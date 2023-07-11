//32) Write a java program to print all Strong numbers between 1 to n.
import java.util.*;
public class StrongNumber 
{
 public static void main(String[] args)
 {
    Scanner sc = new Scanner(System.in);
    int num = sc.nextInt();
    if(isStrongNum(num)){
        System.out.println("this is strong number:" + num);
    }else{
        System.out.println("this is not strong number:" + num);
    }

 }
 public static boolean isStrongNum(int num)
 {
    int sum = 0;
    int original_num = num;
    while(num != 0)
    {
        int dig = original_num%10;
        sum=sum + factorial(dig);
        original_num=original_num/10;
    }
    return (sum==original_num);
    
 }
 public static int factorial(int dig)
 {
    int fact=1;
    for(int i=1 ;i<=dig ; i++){
         fact = fact*i;
    }
    return dig;
 } 
}
