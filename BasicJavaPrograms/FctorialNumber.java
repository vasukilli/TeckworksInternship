import java.util.*;
public class FctorialNumber 
{
    public static void main(String[] arfs)
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter number :");
        int num = sc.nextInt();

        int fact = 1;
        for(int i=num ; i>=1 ; i--){
            fact = fact*i;
        }
        System.out.println(" the fatorial is :" + fact);
    }
    
}
