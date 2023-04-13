import java.util.*;
public class PlayerMain
  {
    public static void main(String[] args)
    {
     
      char ch;
      Scanner sc = new Scanner(System.in);
      System.out.println("this is the data about player details");
       int val = sc.nextInt();
      PlayerImp  pi = new PlayerImp();
     // System.out.println("this is the data about player details");
       System.out.println("enter choice to select the option from 1 to 4");
      System.out.println("1.insert the player data");
      System.out.println("2.delete the player data");
      System.out.println("3.search the player data");
      System.out.println("4.display the player data");
      //System.out.println("enter choice to select the option from 1 to 4");

      do{
        switch(val){
          case 1 : pi.insert();
            break;
          case 2 : pi.delete();
            break;
          case 3 : pi.search();
            break;
          case 4 : pi.display();
            break;
          default:System.out.println("enter valid option only!!!!");
        }
        System.out.println("do you want repeat the process enter the ch value");
        ch = sc.next().charAt(0);
      }while(ch != 'n');
      
    }
  }