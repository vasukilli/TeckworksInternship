import java.util.*;
public class TreeSetDemo2 
{
   public static void main(String[] args)
   {
    TreeSet t = new TreeSet(new MyComparator());
    t.add("vasu");
    t.add("Raja");
    t.add(345);
    t.add("DurgaMahalaxmi");
    t.add(567.0);
    System.out.println(t);
   } 
}
class MyComparator  implements Comparator
{
    public int compare(Object obj1 , Object obj2)
    {
        String s1 = (String)obj1;
        String s2 = (String)obj2;
        return -s1.compareTo(s2);
    }
}
