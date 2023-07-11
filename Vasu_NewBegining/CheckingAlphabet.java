//10) Write a java program to check whether a character is uppercase or lowercase alphabet.
import java.util.*;
public class CheckingAlphabet 
{
 public static void main(String[] args)
 {
    Scanner sc = new Scanner(System.in);
    System.out.println("enter character:");
    char ch = sc.next().charAt(0);
    if(isUpperCase(ch)){
        System.out.println(ch + " this is upper case ");
    }else {
        System.out.println(ch + " this is lower case ");
    }
 }
 public static boolean isUpperCase(char ch)
 {
    boolean t = (ch >= 'A' && ch <= 'Z')?true : false;
    return t;
 }
  
}
