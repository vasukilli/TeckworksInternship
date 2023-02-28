//Write a java program to count the total number of even and odd elements in an array
import java.util.Scanner;
public class EvenOddElements
  {
    public static void main(String[] args)
    {
      Scanner sc = new Scanner(System.in);
      System.out.println("Enter size of array :");
      int s = sc.nextInt();
      int[] a = new int[s];
      System.out.println("Enter elements :");
      
      boolean b = evenOdd(a,s);
      if(b==true){
        System.out.println("this is even number");
      }else{
        System.out.println("this is odd number");
      }
    }
      public static boolean evenOdd(int a[] ,int s){

        for(int i = 0;i<=s-1;i++){
        a[i] = sc.nextInt();
      System.out.print(a[i]);
          }
        
        for(int i =0;i<=s;i++){
          if(a[i]/2==0){
            return true;
          }
        }
          return false;

        
  
  }
  }