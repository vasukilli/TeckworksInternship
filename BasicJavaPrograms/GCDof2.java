import java.util.*;
public class GCDof2
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        int n1 = sc.nextInt();//36
        int n2 = sc.nextInt();//60
        
        int gcd = findGCD(n1,n2);
        System.out.println("the gcd is : " + gcd);
    }
    public static int findGCD(int x , int y)
    {
        if(x==0){
           return y;
        }
        if(y==0){
            return x;
        }
        if(x==y){
            return x;
        }
        int gcd=1;
        for(int i=1 ; i<=x && i<=y ; i++){
            if(x%i==0 && y%i==0){
                gcd=i;
            }
        }
        return gcd;
    }
}