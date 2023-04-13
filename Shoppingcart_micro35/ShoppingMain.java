//Shopping Cart: Create a class called ShoppingCart that stores a collection of items in a ArrayList. The class should have methods to add, remove, and display items in the cart, as well as to calculate the total cost of the items in the cart.
import java.util.*;
class ShoppingMain
  {
    public static void main(String[] args)
    {
      Scanner sc = new Scanner(System.in);
      ShoppingImplementation sim = new ShoppingImplementation();
      
      System.out.println(".....This is the Shopping Cort.....");
      System.out.println("1.add the item details..");
      System.out.println("2.remove the item details..");
      System.out.println("3.display the item details..");
      System.out.println("4.total cost of  the item details..");

      int val ;
      char ch;
      do{
        System.out.println("enter number from 1 to 4 it give requaired output");
         val = sc.nextInt();
        switch(val){
          case 1 : sim.add();
            break;
          case 2 : sim.remove();
            break;
          case 3 : sim.display();
            break;
          case 4 : sim.total_cost();
            break;
          default:System.out.println("insert valid option only");
        }
        System.out.println("you want another more action then enter 'y'");
         ch = sc.next().charAt(0);
        
      }while(ch != 'n');
    }
  }