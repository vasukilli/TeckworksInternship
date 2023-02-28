//Write a java program to find sum of all array elements
import java.util.Scanner;
public class SumOfElements
  {
    public static void main(String[] args)
    {
      Scanner sc = new Scanner(System.in);
      System.out.println("Enter size of array :");
      int s = sc.nextInt();
      int[] a = new int[s];
       System.out.println("Enter elements :");
      
      for(int i = 0;i<=a.length;i++){
        a[i] = sc.nextInt();
      }
      int sum = 0;
      for(int i = 0;i<a.length;i++){
        sum=sum+a[i];
      }
      System.out.println(sum);
      
    }
  }
