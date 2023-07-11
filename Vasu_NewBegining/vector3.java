import java.util.*;
public class vector3 
{
   public static void main(String[] args)
   {
    int n = 5;
    Vector<Integer> v = new Vector<Integer>(n);
    v.add(767);
    v.add(6465);
    v.add(75656);
    v.add(434);
    v.add(67556);
    for(int i = 0;i<v.size();i++)
    {
    System.out.println(v.get(i));
    } 
    int y = 4;
    Vector<Double> nv = new Vector<Double>(n , y);
    nv.add(6577575775.0);
    nv.add(65757.009);
    nv.add(74646.0);
    nv.add(756656.009);
    for(int i=0;i<nv.size();i++)
    {
        System.out.println(nv.get(i));
    }
    v.addElement(65);
    nv.addElement(00000.0);
    System.out.println(v);
    System.out.println(nv);

    v.removeElementAt(0);
    nv.removeElementAt(3);
    System.out.println(v);
    System.out.println(nv);

    System.out.println(v.firstElement());
    System.out.println(v.lastElement());
    v.removeAllElements();
    System.out.println(v.capacity());
    nv.removeAllElements();
    System.out.println(nv.capacity());



  } 
}
