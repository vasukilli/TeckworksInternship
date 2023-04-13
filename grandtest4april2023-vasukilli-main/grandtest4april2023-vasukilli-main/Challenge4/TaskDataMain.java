/*void addTask();
    void removeTask();
    void update_StatusOfTask();
    void displayAllTasks();
    void displayProgressTask();
    void displayCompletedTask();
    void displayOverdueTask(); */
import java.util.*;
class TaskDataMain
  {
    public static void main(String[] args)
    {
      char ch;
      int choice;
      Scanner sc = new Scanner(System.in);
      TaskDataImplementation si = new TaskDataImplementation();
      System.out.println("1.add tasks");
      System.out.println("2.remove tasks");
      System.out.println("3.update status of tasks");
      System.out.println("4.display all tasks");
      System.out.println("5.display progress tasks");
      System.out.println("6.display completed tasks");
      System.out.println("7.display overdue tasks");
      
      do{
        System.out.println("enter your choice");
        choice = sc.nextInt();
        switch(choice)
          {
            case 1 : si.addTask();
              break;
            case 2 :si.removeTask();
              break;
            case 3 : si.update_StatusOfTask();
              break;
            case 4 :si.displayAllTasks();
              break;
            case 5 :si.displayProgressTask();
              break;
            case 6 :si.displayCompletedTask();
              break;
            case 7 :si.displayOverdueTask();
              break;
              default : System.out.println("invalid choice");
          }
        System.out.println("do you want to continue one more option");
        ch = sc.next().charAt(0);
      }
        while(ch != 'n');
    }
  }