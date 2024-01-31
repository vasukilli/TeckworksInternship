//swap two numbers
import java.util.*;
public class SwapNum 
{
    public static void main(String[] arfs)
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter numbers");
        int n1 = sc.nextInt();
        int n2 = sc.nextInt();

        int temp;
        temp=n1;
        n1=n2;
        n2=temp;
        System.out.println("n1: " + n1 + " n2: " +n2);
    }

    
}
