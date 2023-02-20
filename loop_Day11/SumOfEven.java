import java.util.Scanner;
public class SumOfEven
  {
    public static void main(String[] args){
      Scanner sc = new Scanner(System.in);
      System.out.println("enter n :");
      int n = sc.nextInt();
      int sum = 0;
      if(n>=1){
        for(int i =2 ;i<=n;i=i+2){
          sum = sum+i;
        }
        System.out.println(sum);
      }
      }
  }