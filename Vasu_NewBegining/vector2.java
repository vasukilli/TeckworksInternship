import java.util.*;
public class vector2
 {
   public static void main(String[] args)
   {
     Vector v = new Vector();
     v.add(null);
     v.add("vasu");
     v.add(45);
     v.add(56.78);
     v.add('c');
     System.out.println("the elents are " + v);
     System.out.println("the removed object is " + v.set(0,21));//it gives old value as return value
     System.out.println("the removed object is " + v.set(3,"deva rao"));//it gives old value as a return value
     for(int i=0;i<v.size();i++){
        System.out.print(v.get(i) + " ");
     }
   } 
}
