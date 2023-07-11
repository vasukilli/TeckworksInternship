import java.util.*;
public class HashSetDemo
{
  public static void main(String[] args)
  {
    HashSet<String> h = new HashSet<>();
    h.add("vasu");
    h.add("deva");
    h.add("rao");
    h.add("killi");
    System.out.println(h);
    System.out.println(h.add("rao"));

    Iterator itr = h.iterator();
    while(itr.hasNext())
    {
        System.out.print(itr.next() + " ");
    }
  }
}


