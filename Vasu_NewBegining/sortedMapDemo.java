/*
 * SortedMap
 * Object firstKey()
 * Object lastKey()
 * SortedMap tailMap(Object obj)
 * SortedMap headMap(Object obj)
 * SortedMap subMap(Object obj1 , Object obj2)
 * Coomparable comparator()
 * 
 */
import java.util.Map;
import java.util.SortedMap;
import java.util.TreeMap;
public class sortedMapDemo 
{
    public static void main(String[] args)
    {
        SortedMap<Integer,String> sm = new TreeMap<>();
        sm.put(101,"vasu");
        sm.put(102,"deva");
        sm.put(103,"rao");
        sm.put(104,"killi");
        sm.put(105,"pedda");
        sm.put(106,"tamara");
        sm.put(107,"palli");
        sm.put(108,"village");
         Object obj1 = sm.firstKey();
         System.out.println(obj1);
         Object obj2 = sm.lastKey();
         System.out.println(obj2);
         SortedMap m = sm.headMap(105);
         System.out.println(m);
         SortedMap s = sm.tailMap(105);
         System.out.println(s);
         SortedMap s1 = sm.subMap(102,108);
         System.out.println(s1);

 }
}
