/*The sortes set methods are
  Object first()
  Object last()
  SortesSet tailSet()
  SorteDSet headSet()
  SorteDSet subSet()
*/import java.util.Iterator;
import java.util.SortedSet;
import java.util.TreeSet;
public class SortedSetDemo
{
   public static void main(String[] args)
   {
      SortedSet<String> ts
            = new TreeSet<String>();
  
           
  
        // Elements are added using add() method
        ts.add("A");
        ts.add("B");
        ts.add("C");
        ts.add("B");
        ts.add("D");
        ts.add("E");
        System.out.println(ts);
        Iterator itr = ts.iterator();
        while(itr.hasNext())
        {
         System.out.println(itr.next());
        }
        System.out.println(ts.first());
        System.out.println(ts.last());
        System.out.println(ts.tailSet("D"));
        //System.out.println(ts);
        System.out.println(ts.headSet("D"));
        System.out.println(ts.subSet("b","E"));
        


      
      

   }  
}
