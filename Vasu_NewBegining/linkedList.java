import java.util.LinkedList;
import java.util.ArrayList;
public class linkedList
{
    public static void main(String[] args)
    {

        LinkedList<Integer> l = new LinkedList<Integer>();
        l.add(10);
        l.add(59);
        l.add(958);
        l.add(757);
        l.add(756);
        l.add(45);
       System.out.println(l);
        //int[] a = new int[l.size()];
        ArrayList<Integer> b = new ArrayList<>();
        for(Integer a : l){
         b.add(a);
        }
        System.out.println(b);
        int n = b.size()/2;
        int mid = b.get(n);
        System.out.println(mid);

    }
}