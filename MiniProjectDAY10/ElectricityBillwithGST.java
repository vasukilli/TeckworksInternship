import java.util.Scanner;
public class ElectricityBillwithGST
  {
    public static void main(String[] args){
      double prevUnits,presUnits,noOfUnit,billtopay,price;
      
      Scanner sc = new Scanner(System.in);
      System.out.println("enter previous units : ");
      prevUnits =sc.nextDouble();
      
      System.out.println("enter present units : ");
      presUnits=sc.nextDouble();
      
      noOfUnit = prevUnits + presUnits;
      System.out.println("the total number of units : " + noOfUnit );

      if(noOfUnit<100){
        billtopay=noOfUnit*1.20;
        System.out.println("the payble ammount is :" + billtopay);
        System.out.println("the adding of gst to the actual payble ammount:");
        price = billtopay + (billtopay + (20/100));
        System.out.println("after adding gst 20% and then final payble price is :" + price);
      }else if(noOfUnit<300){
        billtopay=100*1.20+(noOfUnit - 100)*2;
        System.out.println("the payble ammount is :" + billtopay);
        price = billtopay + (billtopay + (20/100));
        System.out.println("after adding gst 20% and then final payble price is :" + price);
      }else if(noOfUnit>300){
        billtopay=100*1.20+200*2+(noOfUnit-300)*3;
        System.out.println("the payble ammount is :" + billtopay);
        price = billtopay + (billtopay + (20/100));
        System.out.println("after adding gst 20% and then final payble price is :" + price);
      }else{
        System.out.println("enjoy pandagoww....");
        
      }
    }
}
      
      
      
      
   