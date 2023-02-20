import java.util.Scanner;
public class MultiplicationOfNum
  {
    public static void main(String[] args){
      Scanner sc = new Scanner(System.in);
      System.out.println("enter any num n:");
      int n = sc.nextInt();
      int mul = 0;
      if(n>0){
        for(int i = 0;i<=10;i++){
          mul = n*i;
        
        System.out.println(n +"*"+i+"="+mul);
        }
      }
    }
  }