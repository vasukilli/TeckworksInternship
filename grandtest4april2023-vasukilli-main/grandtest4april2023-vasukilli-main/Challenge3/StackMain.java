/* void push();
    void pop();
    void peek();
    void display();
    void exit();*/
import java.util.*;
//import EmployeeDatabase.EmployeeImp;
class StackMain
  {
    public static void main(String[] args)
    {
      char ch;
      int choice;
      Scanner sc = new Scanner(System.in);
      StackImpl si = new StackImpl();
      System.out.println("1.push elements");
      System.out.println("2.pop elements");
      System.out.println("3.peek elements");
      System.out.println("4.display elements");
     System.out.println("5.exist...");
      
      do{
        System.out.println("enter your choice");
        choice = sc.nextInt();
        switch(choice)
          {
            case 1 : si.push();
              break;
            case 2 :si.pop();
              break;
            case 3 : si.peek();
              break;
            case 4 :si.display();
              break;
            case 5 :si.exit();
              break;
              default : System.out.println("invalid choice");
          }
        System.out.println("do you want to continue one more option");
        ch = sc.next().charAt(0);
      }
        while(ch != 'n');
    }
  }