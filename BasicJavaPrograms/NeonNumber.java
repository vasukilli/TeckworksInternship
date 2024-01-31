// 81 => 8+1=9,9*9=81
// 9 =>9,9*9=81
import java.util.*;
public class NeonNumber
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter a number :");
        int num = sc.nextInt();//81

        int original_num = num;
        int count = 0;//9
        int remainder;
        
        while(original_num != 0){
           remainder = original_num % 10;
           count = count + remainder;
           original_num = original_num/10;

        }
        int res = count*count;
        if(num == res){
            System.out.println(" the number is " + num + " neon number");
        }else{
            System.out.println(" the number is " + num + " not neon number");
        }


    }
    
}
