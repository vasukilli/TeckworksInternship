import java.util.Scanner;
public class SumOfN
  {
    public static void main(String[] args){
    
    Scanner sc = new Scanner(System.in);
    System.out.println("enter n:");
    int n = sc.nextInt();
     int sum = 0;
    if(n>=0){
       sum = (n*(n+1))/2;
      System.out.println(sum);
    }
  }
}