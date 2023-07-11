import java.util.*;
public class vector4 
{
    public static void main(String[] args)//new capacity = current capacity * 2;
    {
        Vector v = new Vector();
        System.out.println(v.capacity());
        for(int i=0 ; i<v.capacity();i++)
        {
            v.addElement(i);
        }
        v.addElement("A");
        System.out.println(v.capacity()); 
    }
}
