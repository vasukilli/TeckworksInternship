//1) Write a java program to print all natural numbers from 1 to n. - using while loop
//print all even numbers between 1 to 100
import java.util.*;
public class PrintNnums 
{
  public static void main(String[] args)
  {
    Scanner sc = new Scanner(System.in);
    System.out.println("enter any number");
    int n = sc.nextInt();
    //1 to n...
    int i=1;
    while(i <= n){
       /*  if(i%2 != 0){
          System.out.println(i + " ");  
        } */  if(i%2 == 0){
          System.out.println(i + " ");  
        }
        i++;
    }
  }  
}
