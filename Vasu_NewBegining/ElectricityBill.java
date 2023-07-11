/*15) Write a java program to input electricity unit charges and calculate total electricity bill
according to the given condition:
For first 50 units Rs. 0.50/unit
For next 100 units Rs. 0.75/unit
For next 100 units Rs. 1.20/unit
For unit above 250 Rs. 1.50/unit
An additional surcharge of 20% is added to the bill
 */
import java.util.Scanner;
public class ElectricityBill 
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the bill:");
        double bill = sc.nextDouble();
        double electrictyBill;
        if(bill <= 50)
        {
             electrictyBill = bill * 0.50;
        }else if(bill <= 150){
            electrictyBill = 25 + (bill-50) * 0.75;
        }else if(bill <=250){
            electrictyBill =100 + (bill-150) * 1.20;
        }else 
        {
            electrictyBill = 225 + (bill-250) * 1.50;
        }
        double surcharges = electrictyBill * 0.2;
        double total_amount = electrictyBill + surcharges;

        System.out.println("bill :" + bill);
        System.out.println(" electrictyBill:" + electrictyBill);
        System.out.println(" total_amount :" + total_amount);





    }
}
