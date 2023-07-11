import java.util.*;
public class ListIteratorDemo3
{
 public static void main(String[] args)
 {
    List<String> l = new ArrayList<String>();
    l.add("vasu");
    l.add("rao");
    l.add("deva");
    l.add("killi");
    System.out.println(l);
    ListIterator ltr = l.listIterator();
    while(ltr.hasNext())
    {
        String s = (String)ltr.next();
        if(s.equals("deva")){
            ltr.remove();
        }
        else if(s.equals("vasu"))
        {
            ltr.remove();
        }
        else if(s.equals("killi"))
        {
            ltr.set("charan");
        }
    }
    //System.out.println(ltr);
 }   
}
