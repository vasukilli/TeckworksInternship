/*Challenge-7: 

Write a program to find a target element in a given array using the binary search technique. The program should then check if the target element is a prime number or not and print an appropriate message. 

Here's a sample input and output for the above question: 

------------------------------------------------------------- 

Sample Input: 

A = [23,45,67,78,86,90] 

Target element is: 67 

Expected Output: 

67 is present in 2nd index position and it is a prime number 

Sample Input: 

A = [23,45,67,78,86,90] 

Target element is: 86 

Expected Output: 

86 is present in 4th index position and it is not a prime number 

 */
import java.util.Scanner;
public class Challenge7
  {
    public static void main(String[] args){
      Scanner sc = new Scanner(System.in);
      System.out.println("enter array size");
      int n= sc.nextInt();
      int[] arr = new int[n];
      for(int i=0;i<n;i++)
      {
        arr[i] = sc.nextInt();
        System.out.print(arr[i] + " ");
      }
      System.out.println("enter target element");
      int tg = sc.nextInt();
      binarySearch(arr,n,tg);
    }
    public static void binarySearch(int[] arr , int n , int tg){
      for(int i=0;i<n;i++){
        int mid = (arr[i] + arr[n])/2;
        if(tg<arr[mid]){
          
        }else if(tg>arr[mid]){
          
        }else if (tg == arr[mid]){
         
          boolean b = (tg%2 == 0) ? true : false;
          {if(b == true){
            String val = "is not a prime number";
            System.out.println(tg + " is present in " + mid + " th index position and iit is " + val);
            
          }else{
            String val = "is  a prime number";
            System.out.println(tg + " is present in " + mid + " th index position and iit is " + val);
            
          }
        }
      }
    }
  }