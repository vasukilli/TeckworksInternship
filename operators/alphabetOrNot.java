// write a program to check wether a character is alphabet or not
import java.util.Scanner;
public class alphabetOrNot
  {
    public static void main(String[] args){
      Scanner sc = new Scanner(System.in);
      System.out.println("enter character");
      char c = sc.next().charAt(0);
      if(c>='a' && c<='z'){
        System.out.println("this is alphabet");
      }else if(c>='A' && c <= 'Z'){
        System.out.println("this is alphabet");
      }else{
        System.out.println("this is not alphabet");
      }
    }
  }
