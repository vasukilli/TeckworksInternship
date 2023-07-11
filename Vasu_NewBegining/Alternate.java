//21) Write java program to print alternate elements of an array starting with index number 1
import java.util.*;
public class Alternate 
{
  public static void main(String[] args)
  {
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();
    int[] arr = new int[n];
    for(int i=0 ; i<=arr.length;i++){
        arr[i] = sc.nextInt();
        System.out.print(arr[i] + " ");
    }
    int[] temp =  alternate(arr,n);
    for(int i=0 ; i<=temp.length;i++){
        System.out.print(temp[i] + " ");
    }

  }
  public static int[] alternate(int[] arr , int n)
  {
    int temp[] = new int[10];
    for(int i=1 ; i<=arr.length ; i=i+2){
       temp[i] = arr[i];
    }
    return temp;  
  }
  
}
