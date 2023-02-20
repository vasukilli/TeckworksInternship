import java.util.Scanner;
public class alphabets {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    char ch = sc.next().charAt(0);
  
      for(ch = 'a';ch<='z';ch++){
        System.out.println(ch);
      }
    }
}
