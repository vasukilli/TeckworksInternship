import java.util.Scanner;
public class CompareTo
  {
    public static void main(String[] args){
      Scanner sc = new Scanner(System.in);
      System.out.println("enter string 1:");
      String s1 = new String(sc.nextLine());
      System.out.println("enter string 2 :");
      String s2 = new String(sc.nextLine());
       compare(s1,s2);
     
    }
     static void compare(String s1,String s2){
    System.out.println(s1.compareTo(s2));
    }
  }