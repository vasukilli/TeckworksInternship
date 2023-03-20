//overriding
import java.util.Scanner;
 class Polymorphism
{
    float basic_salary,bonus;
    int grade;
    
    public void bonusOfEmp(int grade)
    {
        if(grade == 15){
            bonus = (basic_salary*15)/100;
        }
        else if(grade == 16 || grade == 17){
            bonus = (basic_salary*20)/100;
        }
        else if(grade >=18){
            bonus = (basic_salary*25)/100;
        
        }else{
            bonus =0;
        }
    
        System.out.println("your current bonus based on your grade is:"+ bonus);

    }
}
class childPolymorphism extends Polymorphism
{
    double bonus;
    public void bonusOfEmp(int grade1)
    {
        if(grade1 == 15){
            bonus = 12000.0;
        }else if(grade1 == 16 || grade1 == 17){
            bonus = 459.00;
        }else if(grade>= 18){
            bonus = 67858.00;
        }else{
            bonus = 0.0;
        }
         System.out.println("your current bonus based on your grade is:"+ bonus);
    }
 }
 public class PolymorphismMain
 {
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);

        Polymorphism p = new Polymorphism();
        childPolymorphism cp = new childPolymorphism();

        int grade;
        int grade1;
        float basic_salary;

        System.out.println("enter grade in int form:");
        grade = sc.nextInt();
         System.out.println("enter grade in double form:");
        grade1=sc.nextInt();
         System.out.println("enter basic salary in  form:");
        basic_salary=sc.nextFloat();

        p.bonusOfEmp(grade);
        cp.bonusOfEmp(grade1);



    }
 }