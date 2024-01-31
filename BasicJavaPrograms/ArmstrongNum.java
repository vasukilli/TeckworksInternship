import java.util.*;
public class ArmstrongNum
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter any numbers :");
        int n1 = sc.nextInt();
        int n2 = sc.nextInt();
        System.out.println("the armstrong number is :");
        for(int i=n1 ; i<=n2 ; i++){
            if(armstrong(i)){
                System.out.println(i + " ");
            }
        }
    }
    public static boolean armstrong(int num)
    {
        int count = 0 , remainder , original_num , result=0;
        original_num = num;
        while(original_num != 0){
            original_num = original_num/10;
            count++;
        }
        original_num = num;
        while(original_num != 0){
            remainder = original_num % 10;
            result = (int)(result + Math.pow(remainder,count));
            original_num = original_num/10;
        }
    return num == result;
    }
}