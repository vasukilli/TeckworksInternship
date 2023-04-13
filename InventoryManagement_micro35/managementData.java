//Inventory Management: Create a class called InventoryManagement that stores a collection of products in a HashMap. The class should have methods to add, edit, and delete products, as well as to check the availability of a product and display the products that are out of stock.
class managementData
  {
    String product;
    int value;
    public managementData(int v ,String p)
    {
      product = p;
      value = v;
    }
	public String getProduct() {
		return product;
	}
	
	public int getValaue() {
		return value;
	}
	public String toString(){
    return product + " " + value ;
  }
    
  }