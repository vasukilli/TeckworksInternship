import java.util.*;
public class TreeSetDemo3 
{
  public static void main(String[] args)
  {
    TreeSet t = new TreeSet(new NewComparator());
    t.add(new StringBuffer("Z"));
    t.add(new StringBuffer("L"));
    t.add(new StringBuffer("M"));
    t.add(new StringBuffer("Q"));
    t.add(new StringBuffer("X"));
    System.out.println(t);
  }  
}
class NewComparator implements Comparator
{
    public int compare(Object obj1 , Object obj2)
    {
        String s1 = obj1.toString();
        String s2 = obj2.toString();
        //return s2.compareTo(s1);Descendin oreder
        return s1.compareTo(s2);//Ascending order

    }
}
