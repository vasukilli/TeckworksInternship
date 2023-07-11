/* Map m = new Map();
 * Object put(Object o);
 * void putAll(Map m)
 * void remove(Object key)
 * Object get(object key)
 * boolean containsKey(object key)
 * boolean ContainsValue(object value)
 * Set keySet()
 * Set values()
 * Collection entrySet()
 * Entry it holds two methods like getKey() and getVlue() only..
 */
import java.util.*;
public class mapDemo
{
    public static void main(String[] args)
    {
        Map<Integer,String> hm1 = new HashMap<Integer,String>();
        Map<Integer,String> hm2 = new HashMap<Integer,String>();

        hm1.put(1,"vasu");
        hm1.put(2,"deva");
        hm1.put(3,"rao");
        for(Map.Entry<Integer,String> hm0 : hm1.entrySet())
        {
            System.out.println(hm0.getKey() + " - " + hm0.getValue());
        }
        hm1.remove(1);
        System.out.println(hm1);
        hm1.putAll(hm2);
        hm2.put(new Integer(67) , new String("peddathamara palli"));
        hm2.put(new Integer(68) , new String("Nandigam"));
        hm2.put(new Integer(69) , new String("sasanam"));
        for(Map.Entry<Integer , String> hm5 : hm2.entrySet())
        {
            System.out.println(hm5.getKey() + " - " + hm5.getValue());
           
        }
        hm2.remove(67);
        System.out.println(hm2);
        hm1.putAll(hm2);
        System.out.println(hm1);
        Set s = hm1.keySet();
        System.out.println(s);
        Object s1 = (Object)hm1.values();
        System.out.println(s1);


        boolean b = hm1.containsValue("") ? true : false;//ternary operator
        if(b)
        {
            System.out.println("yes");
        }else{
            System.out.println("no");
        }
    }
}