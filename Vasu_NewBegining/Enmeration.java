import java.util.*;
public class Enmeration
 {
   public static void main(String[] args)
   {
    Vector v = new Vector();
    v.addElement("vasu");
    v.addElement(56);
    v.addElement('c');
    v.addElement(null);
    v.addElement(45.9);
    //System.out.println(v);

    for(int i=0 ; i<v.size();i++)
    {
      System.out.println(v.elementAt(i));//object elementAt();
    }
    Enumeration e = v.elements();//public Enumeration elements();
    while(e.hasMoreElements())
    {
      Object o = (Object)e.nextElement();//public Object nextElement();
     
        System.out.print(o + " ");
      
    }


   } 
 }
