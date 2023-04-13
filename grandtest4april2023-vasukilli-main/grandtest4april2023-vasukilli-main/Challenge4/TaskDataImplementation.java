/*Challenge-4: 

You are creating a program to keep track of a list of tasks for a project. Each task has a unique ID, a name, a description, a due date, and a status (e.g. "in progress", "completed", "overdue"). You decide to use a HashSet to store the task IDs, and you need to implement some functionality for adding and removing tasks from the list, as well as updating the status of a task. Write a Java program that implements the following: 

1. Add Task 

2. Remove Task 

3. Update status of Task 

4. Display all the Tasks 

5. Display "in progress" Tasks 

6. Display "completed" tasks 

7. Display "overdue" tasks */
import java.util.*;
class TaskDataImplementation implements TaskDataInter
  {
    HashSet<TaskData> td = new HashSet<>();
    Scanner sc = new Scanner(System.in);
    public void addTask()
    {
      System.out.println("enter task details as book id , name , description,due date  and description");
    int id = sc.nextInt();
    String name = sc.next();
    String description = sc.next();
    String date = sc.next();
    String status = sc.next();
      bd.add(new TaskData(id,name,description,date,status));
      
    }
    public void removeTask()
    {
       if(td.size() == 0){
        System.out.println("no tasks available from remove");
      }else{
        String verify = null;
        System.out.println("enter id");
        int bid = sc.nextInt();
        for(BookShopData e : td)
        {
          if(e.getId() == bid){
            td.remove(e);
            verify = "found";
            break;
          }
        }if(verify == found){
          System.out.println("the task removed from store");
        }
        
      }
    }
    public void update_StatusOfTask()
    {
      
    }
    public void displayAllTasks()
    {
      if(td.size() == 0){
        System.out.println("no data available for display");
      }else{
        Iterator itr = td.iterator();
        while(itr.hasNext()){
          System.out.println(itr.next());
        }
      }
      
    }
    public void displayProgressTask()
    {
      if(td.size() == 0){
        System.out.println("no tasks are available");
      }else{
        System.out.println("enter the status of the tasks");
        String verify = null;
        String tast = sc.next();
        for(TaskData e : td){
          if(e.getStatus() == tast){
            System.out.println("this is in progress task");
            verify = "found";
          }if(verify != found){
            System.out.println("this is not in progress task");
            
          }
        }
      }
      
    }
    public void displayCompletedTask()
    {
      if(td.size() == 0){
        System.out.println("no tasks are available");
      }else{
        System.out.println("enter the status of the tasks");
        String verify = null;
        String tast2 = sc.next();
        for(TaskData e : td){
          if(e.getStatus() == tast2){
            System.out.println("this is in completed task");
            verify = "found";
          }if(verify != found){
            System.out.println("this is not in completed task");
            
          }
        }
      }
      
    }
    public void displayOverdueTask()
    {
      if(td.size() == 0){
        System.out.println("no tasks are available");
      }else{
        System.out.println("enter the status of the tasks");
        String verify = null;
        String tast3 = sc.next();
        for(TaskData e : td){
          if(e.getStatus() == tast3){
            System.out.println("this is in overdue task");
            verify = "found";
          }if(verify != found){
            System.out.println("this is not in overdue task");
            
          }
        }
      }
      
    }
  }