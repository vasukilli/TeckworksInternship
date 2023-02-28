import java.util.Scanner;
public class MaxAndMin
  {
    public static void main(String[] args)
    {
      Scanner sc = new Scanner(System.in);
      System.out.println("Enter size of array :");
      int s = sc.nextInt();
      int[] a = new int[s];
      //int minNo = maxMin(a,s);
       maxMin(a,s);
    
    }

      public static int maxMin(int[] a,int s)
    {
      
      for(int i = 0;i<=s-1;i++){
        a[i] = sc.nextInt();
      int maxNo=a[0];
      int minNo=a[0];
      for( i = 2;i<=s;i++){
        if(maxNo<a[i]){
          maxNo = a[i];
          
        }else if(minNo>a[i]){
            minNo = a[i];
            
          }
        }
        System.out.println("max and min values"+ minNo);
      System.out.println("max and min values"+ maxNo);
      }
    }
}