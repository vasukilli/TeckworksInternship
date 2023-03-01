import java.util.Scanner;
public class StringPalindrom
  {
    public static void main(String[] args){
      Scanner sc = new Scanner(System.in);
      System.out.println("enter a string :");
      String s1 = sc.nextLine();
      String s2 = palindrom(s1);
      if(s1.equals(s2)){
        System.out.println("this is palindrom");
      }else{
        System.out.println("this is not palindrom");
      }
      
    }
    public static String palindrom(String s1){
      String s2 ="";
      for(int i = s1.length() - 1;i>=0;i--){
        s2 = s2 + s1.charAt(i);
      }
      return s2;
      
    }
  }