import java.util.Scanner;
public class Fibanoic
  {
    public static void main(String[] args){
      Scanner sc = new Scanner(System.in);
      System.out.println("enter count :");
      int count = sc.nextInt();
      
      System.out.println(n1 +" "+n2);
      fibanoic(count-2);
    }
     static void fibanoic(int count){
      int n1 = 0;
      int n2 = 1;
      int n3;
      if(count>0){
       n3 = n1+n2;
      n1=n2;
      n2=n3;
      System.out.println( " "+n3);
        fibanoic(count-1);
      
    }
  }
}
