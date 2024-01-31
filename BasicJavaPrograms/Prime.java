import java.util.*;
public class Prime 
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter a number :");
        int n = sc.nextInt();//11
        for(int i=2 ; i<=n ; i++){
            if(isPrime(i)){
                System.out.print( i + " ");
            }
        }

    }
    public static boolean isPrime(int num)
    {
        if(num <=1){
            return false;
        }
        for(int i=2 ; i <= Math.sqrt(num) ; i++){
            if(num%i==0){
                return false;
            }
        }
        return true;
    }
    
}
