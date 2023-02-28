import java.util.*;
public class  FrequencyofArray
  {
    public static void frequency(int arr[],int size,int a[])
    {
      
      for (int i = 0; i < arr.length; i++) {
            int count = 1;
        for (int j = i + 1; j < arr.length; j++) {
                if (arr[i] == arr[j]) {
                    count++;
                    a[i] = -1; 
                  }
            }
            if (a[i] != 1) {
                a [i]= count;
            }
      }
        
        
        System.out.println("Frequency of each element:");
        for (int i = 0; i < arr.length; i++) {
            if (a [i]!= 1) {
                System.out.println(arr[i] + " : " + a[i]);
    }
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
  int ar[] = new int[arraysize];
    frequency(array,arraysize,ar);
    }
}