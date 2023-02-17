import java.util.Scanner;
public class AgeCalculator
  {
    public static void main(String[] args){
      Scanner sc = new Scanner(System.in);
      System.out.println("enter name: ");
      String name = sc.next();
      System.out.println("enter present year :");
      int current_year = sc.nextInt();
      System.out.println("enter present date :");
      int current_day = sc.nextInt();
      System.out.println("enter present month :");
      int current_month = sc.nextInt();
      

      System.out.println("enter birth year :");
      int birth_year = sc.nextInt();
      System.out.println("enter birth month :");
      int birth_month = sc.nextInt();
      System.out.println("enter birth day :");
      int birth_day = sc.nextInt();

      if(current_day<=31&&current_month<=12&&current_year>birth_year)    {

        int current_age = (current_year - birth_year);
        System.out.println( name + " present age is "+ "("+ current_day +"-"+ current_month +"-"+current_year +")" + current_age);
        System.out.println( name + " birth age is "+ "("+ birth_day +"-"+ birth_month +"-"+birth_year+")" );
      
      if(current_age < 18){
        System.out.println(name + " is minor ");
      }else{
        System.out.println(name + " is adult ");
      }
        
      
      
   }
    }
  }