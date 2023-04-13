import java.util.*;
public class NumberChecker
  {
    
public static void main(String[] args)
  {
    System.out.println("number checking game...");
    char option;
    do{
    
  Scanner sc=new Scanner(System.in);
  System.out.println("Guess the number:");
  int number=sc.nextInt();
  Random r=new Random();
      System.out.println("enter system limit:");
      int limit=sc.nextInt();
  int system_num=r.nextInt(limit);
  System.out.println("system Random number is:"+system_num);
    
   if(number==system_num)
   {
     System.out.println("your guess is correct");
    }
      else{
        System.out.println("your guess is wrong");
      }
      System.out.println("do you want to repeat the process");
      
     option=sc.next().charAt(0);
    
    }
    while(option!='n');
  }
}
  