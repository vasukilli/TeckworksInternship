import java.util.Scanner;
public class evenNums
  {
    public static void main(String[] args){
      int n1 =1;
      int n2 = 100;
      while(n1<n2){
        int i = n1++;
        if(i%2==0){
          System.out.println(i);
        }
      }
      
    }
  }