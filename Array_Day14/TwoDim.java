import java.util.Scanner;
public class TwoDim
  {
    public static void main(String[] args){
      Scanner sc = new Scanner(System.in);
      System.out.println("enter size of matrix :");
      int m = sc.nextInt();
      int n = sc.nextInt();
      int fruit[][] = new int[m][n];
      for(int i = 0 ; i<m;i++){
        for(int j=0;j<n;j++){
          fruit[i][j] = sc.nextInt();
        }
      }
    }
  }