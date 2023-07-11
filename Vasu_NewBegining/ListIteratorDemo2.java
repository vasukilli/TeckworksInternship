import java.util.*;
public class ListIteratorDemo2
{
    public static void main(String[] args)
    {
       List<String> l = new ArrayList<String>();
       l.add("vasu");
       l.add("deva");
       l.add("rao");
       l.add("killi");
       System.out.println(l);
       ListIterator ltr = l.listIterator();
       System.out.println("forward direction");
       while(ltr.hasNext())
       {
        System.out.println(ltr.next());
        //System.out.println(ltr.nextIndex());
       }
       System.out.println("backword direction");
       while(ltr.hasPrevious())
       {
        System.out.println(ltr.previous());
        //System.out.println(ltr.previousIndex());
       }

    }
}
