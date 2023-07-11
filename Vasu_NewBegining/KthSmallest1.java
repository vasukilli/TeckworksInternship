//K’th Smallest/Largest Element in Unsorted Array by using treeset
import java.util.*;
import java.lang.*;
public class KthSmallest1 
{
   public static void main(String[] args)
   {
     Scanner sc = new Scanner(System.in);
     System.out.println("ENTER THE ARRAY SIZE:");
     int n = sc.nextInt();
     System.out.println("enter the kth element:");
     int k = sc.nextInt();
     int[] arr = new int[n];
     System.out.println("enter the array elements:");
     for(int i=0 ; i<n ; i++)
    {
        arr[i] = sc.nextInt();
        System.out.print(arr[i] + " ");
    }
    Set<Integer> s = new TreeSet<Integer>();
    for(int i=0 ; i<n ; i++){
        s.add(arr[i]);
    }
     k--;
    Iterator itr = s.iterator();
    while(k>0){
      itr.next();
      k--;
    }
    System.out.println(itr.next());
    
   }
}
