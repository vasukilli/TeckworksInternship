// Map to list
import java.util.*;
public class MaptoList
  {
    public static void main(String[] args)
    {
      Map m=new HashMap();
      m.put(1,"vasu");
      m.put(2,"deva");
      m.put(3,"rao");
      m.put(4,"killi");
      System.out.println(m);
      List<Integer> l= new ArrayList(m.keySet());
        List<String> l1= new ArrayList(m.values());
      for(int i:l)
        {
          System.out.println(i);
        }
      for(String s:l1)
        {
          System.out.println(s);
        }

    }
  }