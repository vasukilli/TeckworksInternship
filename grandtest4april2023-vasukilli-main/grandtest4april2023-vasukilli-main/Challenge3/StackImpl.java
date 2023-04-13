/* void push();
    void pop();
    void peek();
    void display();
    void exit();*/
import java.util.*;
class StackImpl implements StackInter
  {
    Stack<StackData> sd = new Stack<>();
    Scanner sc = new Scanner(System.in);
    public void push()
    {
      if(sd.size() == 0){
        System.out.println("no data available for pushing..stack is empty");
        throw new Exception("stack is empty");
      }else{
        String verify = null;
        System.out.println("enter new object");
        int new1 = sc.nextInt();
        for(StackData e : sd){
          e.push(new1);
          verify = "found";
          break;
        }if(verify == "found"){
          System.out.println("already pushed");
        }
      }
    }
    public void pop()
    {
      if(sd.size() == 0){
        System.out.println("no data available for poping..stack is empty");
        throw new Exception("stack is empty");
      }else{
        String verify = null;
       
        for(StackData e : sd){
         int rem = e.pop();
         System.out.println("the remove element si" + rem); 
          verify = "found";
          break;
        }if(verify == "found"){
          System.out.println("already popped");
        }
      }
      
    }
    public void peek()
    {
      if(sd.size() == 0){
        System.out.println("no data available for checking");
      }else{
        String verify = null;
       
        for(StackData e : sd){
          int val = e.peek();
          System.out.println("the peek element is " + val );
          verify = "found";
          break;
        }if(verify == "found"){
          System.out.println("already checked");
        }
      }
      
    }
    public void display()
    {
      if(sd.size() == 0){
        System.out.println("no data available for poping");
      }else{
        Iterator itr = sd.iterator();
        while(itr.hasNext()){
          System.out.println(itr.next());
        }
        }
    }
    public void exit()
    {
      System.out.println("process completed");
    }

  }