import java.util.Scanner;
public class CharacterArray
  {
    public static void main(String[] args){
      Scanner sc = new Scanner(System.in);
      System.out.println("enter length of char array");
      int len = sc.nextInt();
      char ch[] = new char[len];
      System.out.println("enter characters :");
      for(int i = 0 ;i<len-1;i++){
        System.out.println(ch[i]);
      }
       stringArray(ch,len);
      
      
    }
    static String stringArray(char c[],int len){
     String str = c.toString(c);
      for(int i = 0 ; i<c.length ; i++){
        System.out.println(c[i]);
      }
      
      
    }
  }