//Java Program to Find LCM of Two Numbers
import java.util.*;
public class LCMof2 
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter any 2 numbers :");
        int num1 = sc.nextInt();//19
        int num2 = sc.nextInt();//67
        
        int ans = (num1>num2) ? num1 : num2;

        while(true)
        {
            if(ans%num1 == 0 && ans%num2==0){
                break;
            }
            ans++;
        }
        System.out.println("the lcm of " + num1 + " and " + num2 + " is : " + ans);

    }
    
}
