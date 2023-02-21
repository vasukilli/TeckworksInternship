import java.util.Scanner;
public class AsciiValue
  {
    public static void main(String[] args){
      Scanner sc = new Scanner(System.in);
      System.out.println("enter any character between A to Z ");
      char ch1 = sc.next().charAt(0);
      char ch2 = sc.next().charAt(0);
      int asci1 = ch1;
      int asci2 = ch2;
      System.out.println("the ascii values of the characters "+ asci1);
      System.out.println(asci2);
      }
      
  }