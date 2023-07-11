//13) Write a java program to check whether a number is palindrome or not
import java.util.*;
public class PalindromNum
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        int original_num = sc.nextInt();
        if(checkPal(original_num)){
            System.out.println("palindrm");
        }else{
            System.out.println(" not palindrm");
        }
    }
    public static boolean checkPal(int original_num)
    {
        int original_nums = original_num;
        int reverse_num = 0;
        while(original_nums != 0){
            int dig = original_nums%10;
            reverse_num = reverse_num * 10 + dig;
            original_nums = original_nums/10;
        }
        return reverse_num==original_nums;
    }
}