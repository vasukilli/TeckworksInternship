import java.util.*;
public class HashMapDemo 
{
public static void main(String[] args)
{
    HashMap<String,Integer> m = new HashMap();
    m.put("chirenjivi",400);
    m.put("nagarjuna",500);
    m.put("balayya",600);
    m.put("pawan kalyan",700);
    System.out.println(m);
    for(Map.Entry<String,Integer> M1 : m.entrySet())
    {
       System.out.println(M1.getKey() + "- " + M1.getValue()); 
    }
    System.out.println("...........................");

    Set s1 = m.keySet();
    System.out.println(s1);

    Collection c = m.values();
    System.out.println(c);

    Set s2 = m.entrySet();
    Iterator itr = s2.iterator();
    while(itr.hasNext())
    {
        Map.Entry m1 = (Map.Entry)itr.next();
        System.out.println(m1.getKey() + "...." + m1.getValue());//we can get the key and value by Map.Entry interface class..
        if(m1.getKey().equals("balayya"))
        {
            m1.setValue(1000);//here set the value for the key,and setValue by using the Map.Entry interface class..
        }
        //System.out.println(m);
    }
    System.out.println(m);
}
}
