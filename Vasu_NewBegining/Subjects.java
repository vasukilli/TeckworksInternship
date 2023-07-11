/*
 * 13) Write a java program to input marks of five subjects Physics, Chemistry, Biology,
Mathematics and Computer. Calculate percentage and grade according to following:
Percentage >= 90% : Grade A
Percentage >= 80% : Grade B
Percentage >= 70% : Grade C
Percentage >= 60% : Grade D
Percentage >= 40% : Grade E
Percentage < 40% : Grade F
 */
import java.util.*;
public class Subjects{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the subject marks");
        double Physics = sc.nextInt();
        double Chemistry = sc.nextInt();
        double Biology= sc.nextInt();
        double Mathematics = sc.nextInt();
        double Computer = sc.nextInt();

        double total_marks = Physics + Chemistry + Biology + Mathematics + Computer;
        String grade = "";
        double percentage = (total_marks/500.0) * 100;
        if(percentage >= 90.0){
             grade = "A";
        }else if(percentage >= 80.0){
            grade = "B";
        }else if(percentage >= 70.0){
            grade = "C";
        }else if(percentage >= 60.0){
            grade = "D";
        }else if(percentage >= 40.0){
            grade = "E";
        }else if(percentage < 40.0){
            grade = "F";
        }else{
            System.out.println("not writing the exams");
        }
        System.out.println("total marks" + total_marks);
        System.out.println("percentage" + percentage);
        System.out.println("grade:" + grade);

        

    }

}