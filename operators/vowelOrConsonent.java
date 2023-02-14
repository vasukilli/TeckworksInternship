//write a java program to input any alphabet and check wether it is vowel or consonent
import java.util.Scanner;
public class vowelOrConsonent
  {
    public static void main(String[] args){
      Scanner sc  = new Scanner(System.in);
      System.out.println("enter character");
      char ch = sc.next().charAt(0);
      if(ch == 'a' ||ch == 'e'||ch == 'i' ||ch == 'o' ||ch == 'u' ||ch == 'A' ||ch == 'E' ||ch == 'I' ||ch == 'O' ||ch == 'U')
      {
        System.out.println(ch + " is vowel");
      }else{
        System.out.println(ch + " is Consonent");
      }
    }
  }