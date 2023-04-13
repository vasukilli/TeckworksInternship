import java.util.*;
class Queue
  {
    public static void main(String[] args){
      Queue<Object> q = new Queue<>();
      q.offer("vasu");
      q.offer(23);
      q.offer(null);
      q.offer(45.5);
      q.offer('c');

      Object val = q.peek();
      System.out.println("the val is" + val);

      Object rem = q.poll();
       System.out.println("the remove val is  " + rem);
      System.out.println(q);
    }
  }