import java.util.Scanner;
class product
  {
    public static void main(String[] args)
    {
      Scanner sc = new Scanner(System.in);
      System.out.print("enter product details");
      String product_name = sc.next();
      System.out.println("enter product name " + product_name);
      int MRP = sc.nextInt();
      System.out.println("enter product MRP " + MRP);
      int selling_price = (MRP * 10)/100 ;
      System.out.println("the selling price is " + selling_price);
    }
  }