import java.util.*;
class FinalEx1
  {
    public static void main(String[] args) throws Exception{
      Scanner sc = new Scanner(System.in);
      System.out.println("enter any number:");
      long balance = sc.nextLong();

      if(balance<1000)
        throw new Exception("minimum balance should be 1000");
      else if(balance>10000000)
        throw new Exception("you are exceding maximum balance");
      else 
        System.out.println(balance);
        
     } 
  }
  