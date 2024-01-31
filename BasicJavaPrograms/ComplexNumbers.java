//Java Program to Add two Complex Numbers
import java.util.*;
public class ComplexNumbers 
{
    int real;
    int imag;

    public ComplexNumbers(int r,int i){
        this.real=r;
        this.imag=i;
    }
    public void Show()
    {
        System.out.println(this.real +"+i"+this.imag);
    }
    public static ComplexNumbers add(ComplexNumbers n1,ComplexNumbers n2)
    {
        ComplexNumbers res = new ComplexNumbers(0,0);
        res.real = n1.real+n2.real;
        res.imag = n1.imag+n2.imag;
        return res;
    }
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter first complex num  x and y values");
        int x = sc.nextInt();
        int y = sc.nextInt();

         System.out.println("enter second complex num  x1 and y1 values");
        int x1 = sc.nextInt();
        int y1= sc.nextInt();
        ComplexNumbers c1 = new ComplexNumbers(x,y);
        ComplexNumbers c2 = new ComplexNumbers(x1,y1);

        System.out.println("first complex number is :");
        c1.Show();
        System.out.println("second complex number is :");
        c2.Show();

        ComplexNumbers res = add(c1,c2);
        
        res.Show();
    }
    
}
