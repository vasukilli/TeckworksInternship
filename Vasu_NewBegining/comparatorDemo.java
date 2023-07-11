import java.util.*;
public class comparatorDemo 
{
   public static void main(String[] args)
   {
    TreeSet t = new TreeSet(new myComparator());//object creating for comparator
    t.add(20);
    t.add(0);
    t.add(15);
    t.add(30);
    t.add(34);
    t.add(100);
    t.add(44);
    t.add(77);
    t.add(85);
   System.out.println(t);//default sorting order here internally compareTo() performed.
   }
}
   class myComparator implements Comparator//intrface thats why we can use implements
{

   public int compare(Object obj1 , Object obj2)
   {
     Integer i1 = (Integer)obj1;//integer data type values only
     Integer i2 = (Integer)obj2;
     if(i1<i2)
       return +1;
    else if(i1>i2)
       return -1;
    else 
    return 0;   
   }

} 

