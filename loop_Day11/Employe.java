import java.util.Scanner;
public class Employe
  {
    public static void main(String[] args){
      double da,hra,gross;
      Scanner sc = new Scanner(System.in);
      System.out.println("enter basic salary :");
      double basic_sal = sc.nextDouble();
      if(basic_sal<=10000){
        da=basic_sal*(80/100);
        hra=basic_sal*(20/100);
      }
      else if(basic_sal<=20000){
        da=basic_sal*(90/100);
        hra=basic_sal*(25/100);
      }else{
        da=basic_sal*(95/100);
        hra=basic_sal*(30/100);
      }
      gross = da+hra;
      System.out.println("the gross salary of employee : " + gross);
    }
  }