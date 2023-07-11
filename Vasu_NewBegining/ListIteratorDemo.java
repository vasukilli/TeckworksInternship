/* forwrd directions :-
 * public boolean hasNext()
 * public object next()
 * public int nextIndex()
 * 
 * Backward directions :-
 * public hasPrevious()
 * public object previous()
 * public int previousIndex()
 * 
 * add(object)
 * remove(object)
 * ListIterator ltr = l.listIterator();
 */
import java.util.*;
public class ListIteratorDemo
{
  public static void main(String[] args)
  {
    List<String> l = new ArrayList<String>();
    l.add("Geeks");
    l.add("for");
    l.add("Geeks");
    System.out.println(l);

    ListIterator ltr = l.listIterator();
    while(ltr.hasNext())
    {
        System.out.print(ltr.next() + " ");
    }
    int val = ltr.nextIndex();
    System.out.println(val);
    for(String s : l)
    {
        System.out.println(s);
    }

  }  
}
