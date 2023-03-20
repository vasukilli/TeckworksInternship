import java.util.Scanner;
class Test
  {
    public static void main(String[] args){
      Scanner s = new Scanner(System.in);
      int x=s.nextInt();
      int y=s.nextInt();
      try{
        System.out.println(x/y);
      }
      catch(Exception e){
        System.out.println(e);
        //new airthematic exception created
      }
      finally{
        System.out.println("program completed");
      }
      
    }
    
  }