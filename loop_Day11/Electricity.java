import java.util.Scanner;
public class Electricity

  {
    public static void main(String[] args)
    {
      Scanner sc = new Scanner(System.in);
      System.out.println("enter electricity unit charges :");
      double units = sc.nextDouble();
      if(units<=50){
        double billtopay = units*0.5;
        double gst = billtopay + (billtopay + 20/100);
        System.out.println("payble current fee :"+ gst);
      }
      else if(units<=100){
        double billtopay = units*0.75;
        double gst = billtopay + (billtopay + 20/100);
        System.out.println("payble current fee :"+ gst);
      }
      else if(units==100){
        double billtopay = units*1.20;
        double gst = billtopay + (billtopay + 20/100);
        System.out.println("payble current fee :"+ gst);
      }
      else if(units>250){
        double billtopay = units*1.5;
        double gst = billtopay + (billtopay + 20/100);
        System.out.println("payble current fee :"+ gst);
      }else{
        System.out.println("no read");
      }
    }
  }