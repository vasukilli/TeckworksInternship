import java.util.*;
public class iterator 
{
    public static void main(String[] args)
    {
      ArrayList<Integer> l = new ArrayList<Integer>();
      for(int i=0 ; i<10;i++)
      {
        System.out.println(l.add(i));
      }
      //Iterator itr = new Iterator();
      Iterator itr = l.iterator();
      while(itr.hasNext())
      {
        int i =(Integer)itr.next();
        if(i%2 == 0){
            System.out.println(i);
        }else{
            itr.remove();22
        }
       
      }

      
    }
}


