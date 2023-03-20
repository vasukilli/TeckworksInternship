//Check whether the given mobile number is valid or not
import java.lang.StringBuffer;
import java.util.StringTokenizer;
import java.util.Scanner;
public class MobileVarifie
  {
    public static void main(String[] args){
      Scanner sc = new Scanner(System.in);
      System.out.println("enter string :");
      String str = sc.nextLine();
      StringBuffer sb = new StringBuffer(str);
      int b = checkMobile(str);
      if(b==10){
        System.out.println("this is valid mobile number");
      }else{
        System.out.println("this is not a valid mobile");
      }
    }
    static int checkMobile(String str1){
      StringTokenizer str2 = new StringTokenizer(str1);
      while(str2.hasMoreElements()){
        int count =0;
      for(int i = 0 ; i<str1.length();i++){
       if((str1.charAt(i) >= '0' && str1.charAt(i) <= '9'))
        count++;
        
      }
      
    }
    
      return count;
    }
      
  
  }