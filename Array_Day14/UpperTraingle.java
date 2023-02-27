import java.util.Scanner;
public class UpperTraingle
  {
    public static void main(String[] args)
    {
      Scanner sc = new Scanner(System.in);
      System.out.println("enter matrix size ");
      int n = sc.nextInt();
      int mat[][] = new int[n][n];
      System.out.println("enter array elements :");
      for(int i = 0 ; i<n-1;i++){
        for(int j = 0 ; j<n-1;j++){
          mat[i][j]=sc.nextInt();
        }
      }
      printUpperTraingle(mat,n);
    }
    static void printUpperTraingle(int mat[][] , int n){
      for(int i = 0 ; i<n;i++){
        for(int j = 0;j<n;j++){
          if(i>j){
            System.out.print(0);
          }else{
            System.out.print(mat[i][j] + "");
          }
        }
      }
    }
  }