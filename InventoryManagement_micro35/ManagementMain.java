import java.util.*;
class ManagementMain
  {
    public static void main(String[] args)
    {
      Scanner sc = new Scanner(System.in);
      ManagementImplementation mip = new ManagementImplementation();
      System.out.println("1.add the product details");
      System.out.println("2.edit the product details");
      System.out.println("3.delete the product details");
      System.out.println("4.display the product details");

      System.out.println("chose option from 1 to 4");
      
      char ch;
      do{
         System.out.println("enter option");
      int op = sc.nextInt();
        switch(op)
          {
            case 1 : mip.add_products();
              break;
            case 2 : mip.edit_products();
              break;
            case 3 : mip.delete_products();
              break;
            case 4 : mip.display_availability_product();
              break;
            default : System.out.println("enter valid option only");
              
          }
        System.out.println("you need one more option then enter y");
        ch = sc.next().charAt(0);
        
      }while(ch != 'n');
      
      
    }
  }