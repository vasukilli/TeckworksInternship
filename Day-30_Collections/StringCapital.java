//3.Create class Capitalize having add(), checkCapital() to read data and to verify whether every word of a given text is starting with an upper case vowel or not if it's not starting with the upper case vowel generate a custom exception.  Test your application for any 5 different inputs. Use an array of objects for the test cases.
import java.util.InputMismatchException;
import java.util.Scanner;
class InvalidStringException extends Exception
  {
    public InvalidStringException(String message){
      super(message);
    }
  }
class capital
  {
    Scanner sc = new Scanner(System.in);
    String name = "";
    char[] ch;
    void add()
    {
      try
        {
          System.out.println("enter string :");
          name = sc.nextLine();
        }
      catch(InputMismatchException e){
        System.out.println("enter name must be string type only:");
       // add();
      }
    
    }
    void checking()
    {
      //int n=name.length();
    // char ch[] = new char[n];
      //ch = name.toCharArray();
      //String name =  sc.nextLine();
      
      try{
        int n=name.length();
     char ch[] = new char[n];
        ch = name.toCharArray();
        do{
        int i=0;
        System.out.println("here the checking of string:");
        if(ch[i] >= 'A' && ch[i] <= 'Z'){
          System.out.println("this is valid string " + name);
        }
      }while(n<0);
      }catch(InputMismatchException e){
    System.out.println("this String is not a perfect " );
    
     
    }
  }
}
class StringCapital
  {
    public static void main(String[] args){
      System.out.println("enter number of cases:");
      Scanner s = new Scanner(System.in);
      int v = s.nextInt();
      capital p[] = new capital[v];
      for(int i=0;i<v;i++){
        p[i] = new capital();
        p[i].checking();
        p[i].add();
      }
    }
  }