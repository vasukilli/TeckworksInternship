import java.util.*;
class ConstructorExample
  {
    int num1;
    int num2;
    void ConstructorExample(int x,int y){
      num1=x;
      num2=y;
      
    }
    void getNum1(){
      System.out.println(num1);
    }
    void getNum1(){
      System.out.println(num2);
    }
    void setNum1(){
      Scanner s = new Scanner(System.in);
      num1=sc.nextInt();
    }
    void setNum2(){
      Scanner s = new Scanner(System.in);
      num2=sc.nextInt();
    }
    
  }
class ConstructorMain
  {
    public static void main(String[] args){
      ConstructorExample ce = new ConstructorExample(4,5);//calling cunstructor 0 arguments
     // ConstructorExample ce2;
      ce.getNum1();
      ce.setNum1();
       ce.getNum2();
      ce.setNum2();
    
    }
  }