//Union and Intersection of two sorted arrays
import java.util.*;
public class UnionAndIntersection 
{
  public static void main(String[] arfs)
  {
    Scanner sc = new Scanner(System.in);
    System.out.println("enter 1st size :");
    int s1 = sc.nextInt();
    int[] arr1 = new int[s1];
    System.out.println("enter array elements :");
    for(int i=0 ; i<s1 ; i++){
        arr1[i]=sc.nextInt();
    }
     System.out.println("enter 2st size :");
    int s2 = sc.nextInt();
    int[] arr2 = new int[s2];
    System.out.println("enter array elements :");
    for(int i=0 ; i<s2 ; i++){
        arr2[i]=sc.nextInt();
    }
    UnionArray(arr1,s1,arr2,s2);
    //InsertionArray(arr1,s1,arr2,s2);
  }
  public static void UnionArray(int[] arr1 , int s1,int[] arr2,int s2)
  {
    int[] temp1 = new int[s1+s2];
    if((arr1.length>=arr2.length)||(arr1.length<=arr2.length))
    {
    for(int i=0 ; i<arr1.length ; i++)
    {
        for(int j=0 ; j<arr2.length ; j++)
        {
          if(arr1[i]!=arr2[j]){
             temp1[i] = arr1[i];
             temp1[i+1] = arr2[j];
          }else{
            temp1[i] = arr1[i];
          }
           
        }
    }
    }
    System.out.println("the union array is ");
    for(int i=0 ; i<temp1.length ;i++){
      System.out.print(temp1[i] + " ");
    }
  }
}
