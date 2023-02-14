import java.util.Scanner;
class First
  {
    public static void main(String[] args){
      int x;char y;double z;String h;
      Scanner sc = new Scanner(System.in);
      System.out.println("Enter the values for x,y,z,h");
      x = sc.nextInt();
      y=sc.next().charAt(0);
      z=sc.nextDouble();
      h=sc.next();
      System.out.println("x value is " + x);
      System.out.println("y value is " + y);
      System.out.println("z value is " + z);
      
      
    }
  }