import java.util.*;
public class Power 
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter num");
        int num = sc.nextInt();
        //boolean isPrime = true;
        for(int i=1;i<=num;i++){
        if(i<1){
            System.out.println("no primes");
        }else{
            for(int j=2;j<=Math.sqrt(i);j++)
            {
                if(i%j==0){
                System.out.print(" ..");
                }
                else{
                    System.out.println(i);
                }
            }
        }

    }
}
}
