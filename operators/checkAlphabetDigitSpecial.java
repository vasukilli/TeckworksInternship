//write a java program to input any character and check ehther it is alphabet,digit or special character
import java.util.Scanner;
public class checkAlphabetDigitSpecial
  {
    public static void main(String[] args){
      Scanner sc  = new Scanner(System.in);
      System.out.println("enter character");
      char ch = sc.next().charAt(0);
      if( (ch >= 'a' && ch <= 'z') ||(ch >= 'A' && ch <= 'Z')){
        System.out.println( ch + " is alphabet letter");
      }else if( ch >= '0'&& ch <= '9'){
        System.out.println( ch + " is digit");
      }else{
        System.out.println( ch + " is special character");
      }
    }
}
