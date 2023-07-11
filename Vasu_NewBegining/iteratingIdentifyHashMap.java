import java.util.*;
import java.util.IdentityHashMap;
public class iteratingIdentifyHashMap 
{
   public static void main(String[] args)
   {
    IdentityHashMap<Integer,String> im = new IdentityHashMap<>();
    im.put(101,"geeks");
    im.put(102,"for");
    im.put(102,"geeks");
    im.put(104,"learnes");
    for( Map.Entry<Integer,String> h1 : im.entrySet())
    {
        System.out.println(" key : " + h1.getKey() + " value : " + h1.getValue());
    }
    System.out.println(".........................................................");
    Set s1 = im.entrySet();
    Iterator itr = s1.iterator();
    while(itr.hasNext())
    {
        Map.Entry<Integer,String> h2 = (Map.Entry) itr.next();
        System.out.println(h2.getKey() + " - " + h2.getValue());
        if(h2.getKey() == 102)
        {
             h2.setValue("vasu");
        }

    }
    System.out.println(im);
   } 
}
