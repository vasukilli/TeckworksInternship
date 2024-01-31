//Java Program to Find the Largest of three Numbers
import java.util.*;
public class LargestOf3 
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter any three numbers");
        int x = sc.nextInt();//20
        int y = sc.nextInt();//30
        int z = sc.nextInt();//13
        int lar;
        lar = x;
        if(lar<y){ //20<30
            lar=y;
        }else if(lar<z){ //30<13
            lar=z;
        }
        
        System.out.println("the large value is :" + lar);

    }
    
}
