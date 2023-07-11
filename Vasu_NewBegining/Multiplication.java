//9) Write a java program to print multiplication table of any number.
import java.util.*;
public class Multiplication 
{
  public static void main(String[] args)
  {
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();
    for(int i=0 ; i<=10 ; i++){
        System.out.println(n + " * " + i + " = " + n*i);
    }
  }  
}
