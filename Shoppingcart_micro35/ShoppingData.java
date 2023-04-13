class ShoppingData
  {
    String item_name;
    double item_cost;
    char item_grade;
    
    public ShoppingData(String in , double ic , char ig){
      item_name = in;
      item_cost = ic;
      item_grade = ig; 
      
    }
    public String getItem_name(){
      return item_name;
    }
     public double getItem_cost(){
      return item_cost;
    }
     public char getItem_grade(){
      return item_grade;
    }
    public String toString()
    {
      return item_name + " " + item_cost + " " + item_grade;
    }
    
  }