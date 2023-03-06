import java.util.Scanner;
public class program1
  {
    public static void main(String[] args){
      Scanner sc =new Scanner(System.in);
      System.out.println("enter ammount to withdraw");
      int ammount = sc.nextInt();
      displayNotes(ammount);
    }
    public static void displayNotes(int ammount){
      int notes=0;
      while(ammount>0){
        if(ammount>500){
          notes=notes+((int)ammount/500);
          ammount = ammount%500;
        }
        else if(ammount>=200){
          notes=notes+((int)ammount/200);
          ammount=ammount%200;
        }
        else{
          notes=notes+((int)ammount/100);
          ammount=ammount%100;
        }
        }
      System.out.println("no of notes " + notes);
      }
  }