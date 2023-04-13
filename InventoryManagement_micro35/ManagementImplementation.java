//Inventory Management: Create a class called InventoryManagement that stores a collection of products in a HashMap. The class should have methods to add, edit, and delete products, as well as to check the availability of a product and display the products that are out of stock.
import java.util.*;
class ManagementImplementation implements ManagementInterface
  {
    HashSet<managementData> md = new HashSet<>();
    Scanner sc = new Scanner(System.in);

    public void add_products()
    {
      System.out.println("enter products with value and key pair");
      int v = sc.nextInt();
      String p = sc.next();
      md.add(new managementData(v,p));
    }
    public void edit_products()
    {
      
    }
    public void delete_products()
    {
      if(md.size() == 0){
        System.out.println("no data available for deleting the product");
      }else{
        String verify = null;
        for(managementData e: md){
          System.out.println("enter delete item key value");
          int kv = sc.nextInt();
          if(e.getValaue() == kv){
            md.remove(e);
            verify = "found";
            break;
          }
        }if(verify == null){
          System.out.println("already deleted the data");
        }
      }
      
    }
    public void display_availability_product()
    {
      if(md.size() == 0){
        System.out.println("no product data available in the map");
      }else{
        Iterator itr = md.iterator();
        while(itr.hasNext()){
          System.out.println(itr.next());
        }
      }
      
    }
  }