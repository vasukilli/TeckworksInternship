import java.util.InputMismatchException;
import java.util.Scanner;
class InvalidNumException extends Exception
  {
    public InvalidNumException(String message)
    {
      super(message);
    }
  }
class Nums
  {
    Scanner sc = new Scanner(System.in);
    int[] nums = new int[10];
    int[] temp = new int[10];
    void read()
    {
      System.out.println("enter the array of elements ");
       
      try{
        for(int i=0;i<nums.length;i++)
          nums[i] = sc.nextInt();
         }
      catch(InputMismatchException e){
        System.out.println("enter only integer type of values");
        read();
      }
    }
  
    void sum()
    {
      int count = 0;
      for(int i=0;i<nums.length;i++){
        count=count+nums[i];
      }
      System.out.println("the sum of array is " + count);
    }
    void checkingNum() 
    {
       temp = new int[nums.length];
      System.out.println("this is the checking module");
      try{
        for(int i=0;i<nums.length;i++){
           //nums[i] = sc.nextInt();
          if(nums[i] >= 0){
            temp[i] = nums[i];
            System.out.println(temp[i] + " ");
          }
        }
      }
      catch(Exception e)
        {
          System.out.println("This is negative number so cant acces the array" + e.getMessage());
        }
    }
    
  }
public class ArraySum
  {
    public static void main(String[] args) {
      Scanner sc = new Scanner(System.in);
      System.out.println("enter number of cases");
      int cas = sc.nextInt();
      Nums[] nu = new Nums[cas];
      for(int i=0;i<cas;i++){
        nu[i] = new Nums();
        nu[i].read();
        nu[i].sum();
        nu[i].checkingNum();
        //nu[i].read();
        
      }
    }
  }