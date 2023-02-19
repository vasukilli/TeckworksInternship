import java.util.Scanner;
public class LeepYearCheckerMicro
  {
     public static boolean year(int year)
      {
        
          if(year<=0){
              System.out.println("the year is invalid");
            return false;
           }else{
           boolean b =(((year%4==0)||(year%400==0))&&(year%100!=0))?true:false;
             //return true;
            
           if(b)
           System.out.println(year +  "is loop_year");
          else
            System.out.println(year + "is not a loop_year");
            return true;
           }
    }
      public static void main(String[] args){
      int d;
      Scanner sc = new Scanner(System.in);
      System.out.println("enter year from user :");
      int year = sc.nextInt();
       // LeepYearCheckerMicro c = new LeepYearCheckerMicro();
      System.out.println(year(year));        
     System.out.println("checking another Year ,then enter Year or stop the program then enter 1");
      System.out.println("enter year:");
       year = sc.nextInt();
      System.out.println(year(year));
      System.out.println("enter d:");
       d = sc.nextInt();
 do{
     System.out.println(".....the end....");
     }while(d<=0);
 }
}
        

        
     