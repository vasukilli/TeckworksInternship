import java.util.Scanner;
public class Sec2program5
  {
    public static void main(String[] args)
    {
      Scanner sc = new Scanner(System.in);
      System.out.println("enter any string :");
      String str = sc.next();
      display(str);
    }
    public static void display(String str){
      String a = "";
      String b = "";
      for(int i=0;i<=str.length()-1;i++){
        if(i%2==0){
          a=a+str.charAt(i);
        }else{
          b=b+str.charAt(i);
        }
      }
      System.out.println(a+b);
  
    
  }
}
