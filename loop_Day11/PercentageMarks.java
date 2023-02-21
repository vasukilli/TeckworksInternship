import java.util.Scanner;
public class PercentageMarks
  {
    static int marks(int scored_marks,int total_marks){
    int percentage = (int)((scored_marks*100)/total_marks);
    return percentage;
    }

    
    public static void main(String[] args){
      Scanner sc = new Scanner(System.in);
      System.out.println("enter scored marks : ");
      int scored_marks = sc.nextInt();
      System.out.println("enter total marks : ");
      int total_marks = sc.nextInt();
    // int percentage = (int)(scored_marks*100)/total_marks;
      int percentage = marks(scored_marks,total_marks);
      System.out.println("the percentage marks :" + percentage);
      
      
    }
  }