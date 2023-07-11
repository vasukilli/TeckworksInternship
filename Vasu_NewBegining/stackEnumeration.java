import java.util.*;
public class stackEnumeration 
{
   public static void main(String[] args)
   {
    Stack<Integer> s = new Stack<Integer>();
    for(int i = 0;i <= 10;i++)
    {
        System.out.println(s.push(i));
    }
    Enumeration e  = s.elements();
    while(e.hasMoreElements())
    {
            Integer a =(Integer)e.nextElement();
            if(a%2 == 0){
                System.out.println(a);
            }
    }

   } 
}
