import java.util.Scanner;
public class ReverseNums
  {
    public static void main(String[] args){
      Scanner sc = new Scanner(System.in);
      System.out.println("enter number n :");
      int n = sc.nextInt();
      int i =1;
      while(1<=n){
        for(int i = n ; i>0;i--){
          System.out.println(i);
        }
      }
    }
  }