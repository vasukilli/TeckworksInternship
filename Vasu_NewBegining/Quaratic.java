import java.util.*;
public class Quaratic 
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        double a = sc.nextDouble();
        double b = sc.nextDouble();
        double c = sc.nextDouble();

        double qudrv = b*b - 4*a*c ;
        if(qudrv>0){
            double root1 = -b + Math.sqrt(qudrv);
            double root2 = -b - Math.sqrt(qudrv);
            System.out.println("the roots are :" + root1 + " " + root2);
        }
        else if(qudrv == 0){
            double root3 = -b/2*a;
            System.out.println("the roots are:" + root3);
        }else{
            System.out.println("no roots");
        }
    }
    
}
