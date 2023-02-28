import java.util.*;
public class  SortingArray
  {
    public static void sort(int arr[],int size)
    {
      System.out.println("Sorted array is:");
       for (int i = 0; i < size - 1; i++) {
            for (int j = i + 1; j < size; j++) {
                if (arr[i] > arr[j]) {
                    int temp = arr[i];
                    arr[i] = arr[j];
                    arr[j] = temp;
                }
            
          }
       }
         for(int k=0;k<=size-1;k++)
           {
             System.out.println(arr[k]);
           }
    }
    


public static void main(String[] r)
    {
    Scanner s=new Scanner(System.in);
      System.out.print("enter the size:");
    int arraysize=s.nextInt();
      
    int array[]=new int[arraysize];
      System.out.print("enter the array elemnts:");
    for(int i=0;i<array.length;i++)
      {
        array[i]=s.nextInt();
      }
    sort(array,arraysize);
    }
}