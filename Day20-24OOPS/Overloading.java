//overloading
import java.util.Scanner;
class Polymorphism
{
    float basic_salary,bonus;
    int grade;
    
    public void bonusOfEmp(int grade,float basic_salary,float bonus)
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
    public void bonusOfEmp(double grade1)
    {
        if(grade1 == 15.0){
            bonus = 12000.0;
        }else if(grade1 == 16.0 || grade1 == 17.0){
            bonus = 459.00;
        }else if(grade>= 18.0){
            bonus = 67858.00;
        }else{
            bonus = 0.0;
        }
         System.out.println("your current bonus based on your grade is:"+ bonus);
    }
 }
 public class PolymorphismMain1
 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        Polymorphism p = new Polymorphism();
        int grade;
        double grade1;
        float basic_salary;
        grade = sc.nextInt();
        grade1=sc.nextDouble();
        basic_salary=sc.nextFloat();

        p.bonusOfEmp(grade,basic_salary,bonus);
        p.bonusOfEmp(grade1);


    }
 }