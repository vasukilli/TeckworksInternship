import java.util.*;
public class count 
{
    public static void main(String[] args)
    {
          Scanner sc = new Scanner(System.in);
          int n = sc.nextInt();
          int[] arr = new int[n];
          for(int i=0 ; i<n ; i++)
          {
            arr[i]=sc.nextInt();
            System.out.print(arr[i] + " ");
          }
          System.out.println("enter the value:");
          int val = sc.nextInt();
           int count=0;
          for(int i=0 ; i<n ; i++)
          {
             
            for(int j=i+1 ; j<n ; j++)
            {
             if((arr[i]+arr[j]) == val)
             {
                count++;
             }
            }
    // System.out.println(count);
        }
        System.out.println(count);

    }  
    
}
