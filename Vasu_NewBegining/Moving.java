//Move all negative numbers to beginning and positive to end with constant extra space
import java.util.*;
public class Moving 
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        
        ArrayList<Integer> l = new ArrayList<>();
        System.out.println("enter the aray elements:");
        int n=sc.nextInt();
        for(int i=0 ; i<n; i++)
        {
           l.add(sc.nextInt());

        }
        ArrayList l1 = new ArrayList();
        ArrayList l2 = new ArrayList();
        System.out.print(l);
        Iterator itr = l.iterator();
        while(itr.hasNext()){
            Integer i = (Integer)itr.next();
            if(i<0){
                l1.add(i);
            }else{
                l2.add(i);
            }
        }
        l1.addAll(l2);
        System.out.println(l1);
    }
}
