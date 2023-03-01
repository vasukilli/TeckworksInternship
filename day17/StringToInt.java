import java.util.Scanner;
public class StringToInt
  {
    public static void main(String[] args){
      Scanner sc = new Scanner(System.in);
      System.out.println("enter string value :");
      String s = sc.nextLine();
      int val = convert(s);
      System.out.println(val);
    }
    public static int convert(String s){
      int val = Integer.parseInt(s);
      return val;
    }
  }