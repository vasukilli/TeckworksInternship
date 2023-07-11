import java.util.*;
public class Internal
{
    public static void main(String[] args){
  Stack v = new Stack();
  Enumeration e = v.elements();
  Iterator itr = v.iterator();
  ListIterator ltr = v.listIterator();
  System.out.println(e.getClass().getName());
  System.out.println(itr.getClass().getName());
  System.out.println(ltr.getClass().getName());  
}
}
