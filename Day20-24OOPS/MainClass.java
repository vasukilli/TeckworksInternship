class ClassExample
{
  int var1=10;//instance varieble
  static int var2=20;//static varieable
 void displayOne(){//non static varieable
   int var3=100;//local varieable
    System.out.println(var1+ " " +var2+ " "+var3);
  }
 static void inc(){//static method
    //var1=var1+1;
    var2=var2+1;
  }
}
class MainClass{
    public static void main(String[] args)
  {
      ClassExample ce = new ClassExample();
    ClassExample c = new ClassExample();
    
          System.out.println(ce.var1+" "+ClassExample.var2);
        ce.displayOne();
         c.inc();
     c.displayOne();
         ce.inc();
        
    }
  }