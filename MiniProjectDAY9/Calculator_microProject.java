import java.util.Scanner;
public class Calculator_microProject
  {

      public static int add(int a,int b){
        int addition = (a+b);
        System.out.println( a + "+" + b + "=" + addition);
        return addition;
      }
      public static int sub(int a,int b){
        int substraction = (a-b);
        System.out.println( a + "-" + b + "=" + substraction);
        return substraction ;
      }
      public static int mul(int a,int b){
        int multiplication = (a*b);
        System.out.println( a + "*" + b + "=" + multiplication);
        return multiplication;
      }
      public static int div(int a,int b){
        int division = (a/b);
        System.out.println( a + "/" + b + "=" + division);
        return division;
      }
      public static int mod(int a,int b){
        int modulo = (a%b);
        System.out.println( a + "%" + b + "=" + modulo);
        return modulo;
  }
      public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

      System.out.println(" + : addition operation");
      System.out.println(" - : substraction operation");
      System.out.println(" * : multiplication operation");
      System.out.println(" % : modulo operation");
      System.out.println(" / : division operation");
      System.out.println(" wich operation do you want :");
      
      System.out.println(" enter an operataor :");
      char ch = sc.next().charAt(0);
      
      System.out.println(" enter a and b values ");
      System.out.println(" enter a value :");
      int a = sc.nextInt();
      System.out.println(" enter b value :");
      int b = sc.nextInt();
       
      switch(ch)
        {
          case '+':
            System.out.println(" addition " + add(a,b));
            break;
          case '-':
            System.out.println(" substraction " + sub(a,b));
            break;
          case '*':
            System.out.println(" multiplication " + mul(a,b));
            break;
          case '%':
            System.out.println(" module " + mod(a,b));
            break;
          case '/':
            System.out.println(" divide " + div(a,b));
            break;
          default:
            System.out.println("no operator found");
        }

       
            
            
        }
      
    }
  }
