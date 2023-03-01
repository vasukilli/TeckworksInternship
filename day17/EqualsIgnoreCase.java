import java.util.Scanner;
public class EqualsIgnoreCase
  {
    public static void main(String[] args){
      Scanner sc = new Scanner(System.in);
      System.out.println("enter string 1:");
      String s1 = sc.nextLine();
      System.out.println("enter string 2:");
      String s2 = sc.nextLine();

      boolean b = equalIgnore(s1,s2);
      System.out.println(b);
      
    }
    static boolean equalIgnore(String s1,String s2){
      boolean b = s1.equalsIgnoreCase(s2);
      return b;
    }
  }