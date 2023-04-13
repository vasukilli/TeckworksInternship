//add,remove,display,total_cost
import java.util.*;
class ShoppingImplementation implements ShoppingInterface
  {
    Scanner sc = new Scanner(System.in);
    ArrayList<ShoppingData> sd = new ArrayList<>();
    //double[] costTotal = new double[10];

    public void add()
    {
      System.out.println("enter the items with cost and item grade ");
      String in = sc.next();
      double ic = sc.nextDouble();
      char ig = sc.next().charAt(0);
      sd.add(new ShoppingData(in , ic , ig));
      
    }
    public void remove()
    {
      if(sd.size() == 0){
        System.out.println("no item available for deleting the data");
      }else{
        String verify = null;
        System.out.println("enter item name to remove the entire data");
        String itemr = sc.next();
        for(ShoppingData e : sd){
          if(e.getItem_name().equals(itemr)){
            sd.remove(e);
            verify = "found";
            break;
          }
        }
        if(verify == null){
          System.out.println("already removed the item data from the database");
        }
      }
    }
    public void display()
    {
      if(sd.size() == 0){
        System.out.println("no data available for display the items");
      }else{
        Iterator itr = sd.iterator();
        while(itr.hasNext()){
          System.out.println(itr.next());
        }
      }
    }
    public void total_cost()
    {
      double cost_count = 0;
      
        for(int i=0;i<sd.size();i++){
          for(ShoppingData e : sd){
            
        cost_count = e.getItem_cost() + cost_count;
      }
      System.out.println("the total cost of the items :" + cost_count);
      }
      
    
}}