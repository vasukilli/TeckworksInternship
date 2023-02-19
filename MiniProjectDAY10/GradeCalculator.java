import java.util.Scanner;
public class GradeCalculator
  {
    public static void main(String[] args){
      Scanner sc = new Scanner(System.in);
      System.out.println("enter no.of subjects");
      int n = sc.nextInt();
      System.out.println("enter subject with marks");
      int average,sum=0;
  
      for(int i=1;i <= n;i++){
        String subject = sc.next();
        int marks = sc.nextInt();
        System.out.println(subject + ":" + marks );
        sum = sum+marks;
        
      }
      System.out.println("the total marks of subjects : " + sum);
      
      average = sum/n;
      System.out.println("the average of subject marks : " + average);
    

      if(average >= 90)
        System.out.println("Grade : A");
      
      else if(average>= 70 && average < 90)
        System.out.println("Grade : B");

      else if(average>= 50 && average <70)
        System.out.println("Grade : c");

      
      else if(average>= 40 && average <50)
        System.out.println("Grade : D");
        
      else if(average < 40)
        System.out.println("Grade : fail");

      else 
        System.out.println("not attended to exame");
    
        

     System.out.println("enter another student marks data : "); 
       String subject = sc.next();
       int marks = sc.nextInt();
    System.out.println("stop the grading of student then enter d is 1 ");
      System.out.println("enter d : ");
      int d = sc.nextInt();
      do{
        System.out.println("....the end...");
        
      }while(d<=0);
    }
  }