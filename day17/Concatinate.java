import java.util.Scanner;
public class Concatinate
  {
    public static void main(String[] args){
      Scanner sc = new Scanner(System.in);
      System.out.println("enter first string:");
     String s1 = new String(sc.nextLine());
      System.out.println("enter second string:");
      String s2 = new String(sc.nextLine());
       String s3 = concate(s1,s2);
      System.out.println(s3);
    }
    static String concate(String s1,String s2){
      String s3 = s1.concat(s2);
     return s3;
  }
  }