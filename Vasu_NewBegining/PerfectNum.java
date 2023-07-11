//29) Write a java program to check whether a number is Perfect number or not.
import java.util.*;
public class PerfectNum 
{
    public static void main(String[] args)
    {
    Scanner sc = new Scanner(System.in);
    int num = sc.nextInt();
    if(isPerfectNum(num)){
        System.out.println("this is perfect number:" + num);
    }else{
        System.out.println("this is not perfect number:" + num);
    }
    }
    public static boolean isPerfectNum(int num)
    {
        //inttemp = num;
        int sum = 0;
        for(int i=1 ; i<=num/2;i++)
        {
            if(num%i == 0){
                sum=sum+i;
            }
        }
        return (sum == num);
    }  

}
