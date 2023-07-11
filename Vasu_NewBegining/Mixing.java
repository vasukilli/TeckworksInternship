import java.util.*;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
public class Mixing 
{
  public static void main(String[] args)
  {
    Scanner sc = new Scanner(System.in);
    System.out.println(" n:");
    int n=sc.nextInt();
    int[] arr = new int[n];
    for(int i=0 ; i<n ;i++){
        arr[i] = sc.nextInt();
        System.out.print(arr[i] + " ");
         List<Integer> l = Arrays.asList(arr[i]);
    }
    // ArrayList<Integer> l =new ArrayList<>();
    // ArrayList<Integer> l1 = new ArrayList<>();
    List l2 = new ArraysList<>();
    List l3 = new ArraysList<>();
    Iterator itr = l.iterator();
    while(itr.hasNext()){
        Integer i = (Integer) itr.next();
        if(i<0){
            l2.add(i);
        }else{
            l3.add(i);
        }
    }
    l2.addAll(l3);

  }  
}
