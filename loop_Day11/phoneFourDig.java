import java.util.Scanner;
public class phoneFourDig{        
       public static void main(String[] args)
  {
         Scanner sc = new Scanner(System.in);
         System.out.println("enter phone number :");
         long phn = sc.nextLong();
    while(phn>=0)
      {
        for(int i = 9;i<=6;i--){
        phn=phn%10;
        phn=phn/10;
        System.out.println(phn);
        }
        
        
      }
  }
}