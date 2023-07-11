import java.util.*;
public class stack
 {
    public static void main(String[] args)
    {
     Stack s = new Stack();
     s.push("vasu");
     s.push(656);
     s.push(65.9);
     s.push('c');
     System.out.println(s);
     Stack<Integer> s1 = new Stack<>();
     s1.push(756);
     s1.push(65757);
     s1.push(65656);
     s1.push(767);
     s1.push(34435);
     s1.push(75656);
     for(int i=0;i<s1.size();i++){
        System.out.println(s1.get(i));
     }
     System.out.println(s1.pop());
     System.out.println(s.pop());
     Object val = s.peek();
     int val1 = s1.peek();

     System.out.println("val :" + val + " and " + "val1 :" + val1);

     System.out.println(s.search(65.9));
     System.out.println(s.search(0000));


     System.out.println(s1.search(767));
     System.out.println(s1.search(0000));
     

    }
}
