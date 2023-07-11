//1)FiFind a peak element which is not smaller than its neighboursnd 
import java.util.*;
public class PeekIndex
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter size:");
        int n = sc.nextInt();
        int[] arr = new int[n];
        for(int i=0 ; i<arr.length ;i++)
        {
            arr[i] = sc.nextInt();
        }
        System.out.println("the peek value index is :" + findPeek(arr,n));
    }
    public static int findPeek(int[] arr , int n)
    {
        if(n==1)
        return 0;
        if(arr[n-1]>=arr[n-2])
        return n-1;
        if(arr[0]>=arr[1])
        return 0;
        for(int i=1 ; i<n-1 ; i++){
           if(arr[i]>=arr[i-1] && arr[i]>=arr[i+1])
           return i;
        }
        return 0;
    }
}