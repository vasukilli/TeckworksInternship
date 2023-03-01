import java.util.*;
public class Display {
  public static boolean primegenerator(int n) {
    for (int i = 2; i < n; i++) {
      if (n % i == 0) {
        return false;
      }
    }
    return true;
  }

  public static void displayArray(int arr[],int s)
    {
      int c1=0,c2=0,c3=0,c4=0,c5=0;
      for(int i=0;i<=s-1;i++)
        {
          if(arr[i]<0)
          {
            c1++;
          }
          else if(arr[i]>0 && arr[i]%2==0)
            {
            c2++;
            }
          else if(arr[i]>0 && arr[i]%2!=0) 
            {
            c3++;
            }
          else if(arr[i]>0 && primegenerator(arr[i]))
            {
            c4++;
            }
          else
          {
            c5++;
          }
        }
      System.out.println("Negative numbers are:"+c1);
       System.out.println("positive numbers are:"+(c2+c3));
       System.out.println("even numbers are:"+c2);
       System.out.println("odd numbers are:"+c3);
       System.out.println("prime numbers are:"+c4);
       System.out.println("zero numbers are:"+c5);
    }

  public static void main(String[] ar) {
    Scanner s = new Scanner(System.in);
    System.out.print("enter the array size:");
    int arraysize = s.nextInt();
    int array[] = new int[arraysize];
    System.out.print("enter the array elemnts:");
    for (int i = 0; i < array.length; i++) {
      array[i] = s.nextInt();
    }
    displayArray(array, arraysize);
  }
}