import java.util.Scanner;
public class MobileNumberAccept{
        
       public static void main(String[] args)
  {
         Scanner sc = new Scanner(System.in);
        System.out.println("enter phone number :");
         String phn = sc.next();
     
    if( phn.length()>=0 && phn.length()<=10){
      System.out.println("valid phone number");
    }else{
      System.out.println("invalid phone number");
      
    }
  }
}
