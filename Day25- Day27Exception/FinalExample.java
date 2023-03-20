import java.util.*;
class FinalExample
  {
    public static void main(String[] args){
      //int x=12;
      //int u = 0;
      int atmpin = 3242;
      try
        {
          if(atmpin != 1111)
          //System.out.println(Math.sqrt(x));
         
           throw new Exception();
            
        }
      catch(Exception e){
        System.out.println("invalid pin");
        
      }
    }
  }