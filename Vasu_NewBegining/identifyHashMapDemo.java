import java.util.*;
public class identifyHashMapDemo 
{
   public static void main(String[] args)
   {
    /*HashMap m = new HashMap();//content comparision on objects
    Integer i1 = new Integer(10);
    Integer i2 = new Integer(10);
    m.put(i1,"pawan");//(10,pawan) => (10,kalyan)...here .equals()..i1.equals(i2)
    m.put(i2,"kalyan");//(10,kalayan)
    System.out.println(m); */

    IdentityHashMap m = new IdentityHashMap();//data references comparision
    Integer i1 = new Integer(10);
    Integer i2 = new Integer(10);
    m.put(i1,"pawan");//here i1 == i2 ,references are not same
    m.put(i2,"kalyan");
    System.out.println(m);


   } 
}
