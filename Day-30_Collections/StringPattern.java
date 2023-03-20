//2.Create a class StringPattern having methods add() and pattern() to take input and verify whether each word starts and ends with the same alphabet or not, if not generate a custom exception. Test your code for any 4 different test cases. Use an array of objects for the test case
import java.util.InputMismatchException;
import java.util.Scanner;
class InvalidStringException extends Exception
  {
    public InvalidStringException(String message){
      super(message);
    }
  }
class pattern
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
        add();
      }
    
    }
    void checking()
    {
      int n=name.length();
      ch = new char[n];
      ch = name.toCharArray();
      for(int i=0;i<n;i++){
      try{
        //for(int i=0;i<n;i++){
        System.out.println("here the checking of string:");
        if(ch[i] == ch[n-1]){
          System.out.println("this is valid string " + name);
        }
      }catch(InputMismatchException e){
    System.out.println("this String is not a perfect " + e.getMessage());
    
     
    }
  }
  }
  }
class StringPattern
  {
    public static void main(String[] args){
      System.out.println("enter number of cases:");
      Scanner s = new Scanner(System.in);
      int v = s.nextInt();
      pattern p[] = new pattern[v];
      for(int i=0;i<v;i++){
        p[i] = new pattern();
        p[i].checking();
        p[i].add();
      }
    }
  }