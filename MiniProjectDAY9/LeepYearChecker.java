import java.util.Scanner;
public class LeepYearChecker
  {
    public static boolean year(int Year){
      boolean b = ((Year%4==0&&Year%400==0)||(Year%100!=0)) ?  true: false ;
      
      return b;
    }
    
    public static void main(String[] args)
    {
      boolean a;
     Scanner sc = new Scanner(System.in);
      System.out.println("enter year :");
      int Year = sc.nextInt();
      if(a==true){
      
       System.out.println("the " + Year + "is "+ year(Year));
      
    }
  }

  }