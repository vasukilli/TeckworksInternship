import java.util.Scanner;
public class RockPaperScissore
  {
    public static void main(String[] args){
      Scanner sc = new Scanner(System.in);
      System.out.println("enter 1 for rock");
      System.out.println("enter 2 for paper");
      System.out.println("enter 3 for Scissore");
      int n = sc.nextInt();
      if(n==1){
        System.out.println("user choice : Rock");
        for(int r=1;r<4;r++){
          if(r==1);
            else if(r==1){
             System.out.println("computer choice : rock");
             System.out.println("tie!!");}
           else if(r==2){
             System.out.println("computer choice : paper");
             System.out.println("you loss!!");}
           else if(r==3){
             System.out.println("computer choice : scissors");
             System.out.println("you win!!");
             }
        }
      }
        else if(n == 2){
          System.out.println("user choice : paper");
        for(int r=1;r<4;r++){
            if(r==1);
            else if(r==1){
             System.out.println("computer choice : rock");
             System.out.println("you win!!");
            }
           else if(r==2){
             System.out.println("computer choice : paper");
             System.out.println("tie!!");}
           else if(r==3){
             System.out.println("computer choice : scissors");
             System.out.println("you loss!!");
        
        }
      }
    }
      else if(n == 3){
          System.out.println("user choice : paper");
        for(int r=1;r<4;r++){
          if(r==1);
            if(r==1){
             System.out.println("computer choice : rock");
             System.out.println("you loss!!");
            }
           else if(r==2){
             System.out.println("computer choice : paper");
             System.out.println("you win!!");}
           else if(r==3){
             System.out.println("computer choice : scissors");
             System.out.println("tie!!");
           }
        }
      }
      else{
        System.out.println("you enter invalid number,so enter valid numbers like 1,2 and 3!! only ");
        System.out.println("you can end the game enter '0' or contenue to play game enter '1' only!!!");
        int d = sc.nextInt();
        while(d==0){
          System.out.println("game ended");
        }
      }
    }
  }
      
  
            
      