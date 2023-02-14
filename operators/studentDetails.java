import java.util.Scanner;
class studentDetails{
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    int std_id = sc.nextInt();
    String std_name = sc.next();
    int std_rln = sc.nextInt();
    // subjects marks from commandpropt
    int s1 = sc.nextInt();
    float s2 = sc.nextInt();
    int s3 = sc.nextInt();
    System.out.print("enter number of subjects");
    int n = sc.nextInt();
    System.out.println("student name" + std_name);
    System.out.println("student id" + std_id);
    System.out.println("student name" + std_rln);
    

    float average = (s1+s2+s3)/n;
    System.out.println(" the average of marks" + average);
     
    
  }
}