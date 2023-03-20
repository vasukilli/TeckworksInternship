class Test1
    {
  
      static int x=20;
      int y=10;
  
      static void display(){
      x=x+1;
        System.out.println(x);
      }
    void display1(){
      x=x-1;
      y=y-1;
      System.out.println(x+""+y);
    }
  }
class MainClass{
  public static void main(String[] args)
  {
   Test1  ce = new Test1();
   ce.display();
    ce.display1();
    System.out.println(ce.x +" "+ce.y);
  }
}