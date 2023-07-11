import java.util.*;
public class IndexFinding 
{
   public static void main(String[] args)
   {
    Scanner sc = new Scanner(System.in);
    System.out.println("n :");
    int n= sc.nextInt();
    System.out.println("enter sum value :");
    int sum = sc.nextInt();
    
    int[] arr = new int[n];
    for(int i=0 ; i<n ; i++){
        arr[i] = sc.nextInt();
        System.out.print(arr[i] + " ");
    }
    findRes(arr,n,sum);

   }
   public static void findRes(int[] arr ,int n, int sum)
   {
    int count,j;
    for(int i=0 ; i<n ; i++){
         count = 0;
        for( j=i+1 ; j<n ; j++)
        {
            if((arr[i]+arr[j])==sum){
                count = count +(arr[i]+arr[j]);
            }

        }
        if(count == sum)
        {
         
        System.out.println("\nx:" + i + "y:" + j);    
        }else{
            System.out.println("there are no sub array");
        }
   }
  }
}
