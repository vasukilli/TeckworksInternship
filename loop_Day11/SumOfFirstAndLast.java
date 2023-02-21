import java.util.Scanner;
public class SumOfFirstAndLast
  {
    public static void main(String[] args){
      Scanner sc = new Scanner(System.in);
      System.out.println("enter num :");
      int num = sc.nextInt();
      int firstDig = 0;
      int lastDig = 0;
      lastDig = num%10;
        System.out.println("last digit is :"+lastDig);
      
      while(num!=0)
     {
        num=num%10;
        num=num/10;
        //firstDig=num;
     }
         firstDig=num;
      
        System.out.println("last digit is :"+firstDig);
     
      int sum = lastDig+firstDig;
      System.out.println(sum);
}
}
      
      