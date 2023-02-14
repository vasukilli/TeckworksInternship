import java.util.Scanner;
public class leepYear{
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    System.out.print("enter a year ");
    int year = sc.nextInt();
    boolean result = ((year%4 == 0)||(year%400==0))&&(year%100!=0) ? true:false;
    if(result == true){
      System.out.println( year + " is leep year");
    }else{
      System.out.println( year + " is not leep year");
    }
  }
}