import java.util.*;
class MaptoSet
  {
    public static void main(String[] args)
    {
       Map<Integer,String> m=new HashMap<>();
      m.put(1,"vasu");
      m.put(2,"deva");
      m.put(3,"rao");
      m.put(4,"killi");
      Set<Integer> s1= new HashSet<Integer>(m.keySet());
      Set<String> s2= new HashSet<String>(m.values());
      System.out.println(s1);
      System.out.println(s2);
    }
  }