import java.util.Scanner;
public class Peter
  {
    public static void main(String[] args){
      Scanner sc = new Scanner(System.in);
      System.out.println("enter game points :");
      String s = sc.nextLine();
      displayWinOrLoss(s);
    }
    public static void displayWinOrLoss(String s){
      int k = 0 ;
      int c = 0;
      for(int i = 0 ;i<s.length();i++){
        if(s.charAt(i)=='1'){
          k++;
        }else{
          c++;
        }
        if(k>c){
          System.out.println("win");
        }else{
          System.out.println("loss");
        }
      }
      
    }
  }