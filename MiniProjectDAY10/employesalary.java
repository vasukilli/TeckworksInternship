import java.util.Scanner;
public class employesalary
  {
    public static void main(String[] args)
    {
      double gross_salary , income_tax , provident_fond, professional_tax , net_salary;
      Scanner sc = new Scanner(System.in);
      System.out.println("enter gross salary :");
      gross_salary = sc.nextDouble();
      System.out.println("enter income tax :");
      income_tax = sc.nextDouble();
      System.out.println("enter provident fond :");
       provident_fond = sc.nextDouble();
      System.out.println("enter net salary :");
      net_salary = sc.nextDouble();
      System.out.println("enter professional tax :");
      professional_tax = sc.nextDouble();

      net_salary = salary(gross_salary,income_tax,provident_fond,professional_tax);

      System.out.println("the employee net salary is : " + net_salary);

    }
    static double salary(double gross_salary,double income_tax,double provident_fond,double professional_tax)
    {
      provident_fond = provident_fond*(gross_salary/100);
      income_tax = income_tax*(gross_salary/100);
      professional_tax = professional_tax*(gross_salary/100);
      
      double net_salary = (gross_salary-provident_fond-income_tax-professional_tax);
      return net_salary;
    }
  }

    