import java.util.Scanner;
public class UpperCase
  {
    public static void main(String[] args){
      Scanner sc = new Scanner(System.in);
      System.out.println("enter string :");
      String s = sc.nextLine();
      String a = upperCase(s);
      System.out.println(a);
    }
    static string upperCase(String s){
      String a = s.toUpperCase();
      return a;
    }
  }