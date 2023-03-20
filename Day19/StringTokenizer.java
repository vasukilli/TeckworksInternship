import java.util.*;
public class StringTokenizer
  {
    public static void main(String[] args){
      Scanner sc = new Scanner(System.in);
      String str = sc.nextLine();
      StringTokenizer st = new StringTokenizer(str);
      System.out.println(str.countTokens());
      
      while(str.hasMoreTokens()){
        System.out.println(str.nextToken());     
      }
    }

    
  }