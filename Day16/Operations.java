import java.util.Scanner;
public class Operations
  {
    public static void main(String[] args)
    {
    Scanner sc = new Scanner(System.in);
    System.out.println("enter num :");
    int n1 = sc.nextInt();
    System.out.println("enter num :");
    int n2 = sc.nextInt();

    int add = addition(n1,n2);
    System.out.println(add);

    int sub = substraction();
    System.out.println(sub);

     multiplication(n1,n2);
   

     division();
    
    }
    static int addition(int n1,int n2){
      int add = (n1+n2);
      return add;
    }
    static int substraction(){
      Scanner sc = new Scanner(System.in);
      System.out.println("enter a and b");
      int a = sc.nextInt();
      int b = sc.nextInt();
      int sub = (a-b);
      return sub;
    }
    static void multiplication(int n1,int n2){
      int mul = (n1*n2);
      System.out.println(mul);
      
    }
    static void division(){
      Scanner sc = new Scanner(System.in);
      System.out.println("enter a and b");
      int a = sc.nextInt();
      int b = sc.nextInt();
      int div = (a/b);
      System.out.println(div);
    }
}
    
  