//reate a class tax having parameter GST, import this property in to state class having its own property stateGst and find total tax need pay for nation and state
class Tax
  {
    double GST;
    double amount;
    Tax(double GST,double amount){
      this.GST=GST;
      this.amount=amount;
    }
    void getDetails(){
      System.out.println(GST +" "+ amount);
    }
    
  }
class State extends Tax
  {
    double stategst;
    State(double am,double gst,double stategst){
      super();
      this.amount=am;
      this.gst=gst;
      this.stategst = stategst;
    }
    void getDetails(){
      System.out.println(stategst);
    }
    void calculateTax(){
      double totalnationaltax;
      double totalstatetax;
       totalnationaltax = amount + (amount*13/100);
      totalstatetax = amount + (amount*13/100);
      System.out.println("total tax :" + totalnationaltax);
      System.out.println("total state tax :" + totalstatetax);
    }
    
  }
class TaxMain
  {
    public static void main(String[] args){
      Scanner s = new Scanner(System.in);
      System.out.printlln("enter amount,gst and state gst");
      double am=s.nextDouble();
      double gst=s.nextDouble();
      double sgst=s.nextDouble();

      Tax t = new Tax(am,gst);
      State st=new State(am,gst,stategst);
      t.getDetails();
      st.getDetails();
      st.calculateTax();
    }
    
  }