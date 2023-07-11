/*
 14) Write a java program to input basic salary of an employee and calculate its Gross
salary according to following:
Basic Salary <= 10000 : HRA = 20%, DA = 80%
Basic Salary <= 20000 : HRA = 25%, DA = 90%
Basic Salary >20000 : HRA = 30%, DA = 95%
*/
import java.util.*;
public class GrossSal 
{
   public static void main(String[] args)
   {
    Scanner sc = new Scanner(System.in);
    System.out.println("enter the bas salary");
    double bas_sal = sc.nextDouble();
    double HRA = 0.0;
    double DA = 0.0;
    if(bas_sal <= 10000){
        HRA = 0.2 * bas_sal;
        DA = 0.8 * bas_sal;
    }else if(bas_sal <= 20000){
        HRA = 0.25 * bas_sal;
        DA = 0.9 * bas_sal;
    }else {
        HRA = 0.3 * bas_sal;
        DA = 0.95 * bas_sal;
    }
    double gross_sal = bas_sal + HRA + DA;
    System.out.println("base salary:" +bas_sal);
    System.out.println("HRA:" + HRA);
    System.out.println("DA:" + DA);
    System.out.println("gross salary:" +gross_sal);

   } 
}
