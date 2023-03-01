import java.util.Scanner;
public class CharacterAtIndex
  {
    public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    System.out.println("enter string :");
    String s = sc.nextLine();
    char ch = character(s);
    System.out.println(ch);
  }
  static char character(String s){
    System.out.println("enter index value:");
    int n = sc.nextInt();
    char ch = s.charAt(n);
    return ch;
  }
}