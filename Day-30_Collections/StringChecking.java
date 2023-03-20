//1.Create a class called StringCheck having methods add() & Check()  to give data and verify each word ending with “ing”. Generate a custom exception if the string not ending with “ing”. Test this application for any 4 different text inputs. Use an array of objects for the test cases.
import java.util.Scanner;
class InvalidStringException extends Exception
  {
    public InvalidStringException(String message){
      super(message);
    }
  }
class StringCheck
  {
    String val="";
    char[] ch;
    Scanner sc = new Scanner(System.in);
    void add()
    {
      System.out.println("enter the requaired string :");
      try
        {
          val = sc.nextLine();
        }
      catch(InputMismatchException e){
        System.out.println("enter value must be String type only");
        add();
      }
    }
    void check()
    {
      System.out.println("the checking of String ");
      ch = val.toCharArray();
      int n = ch.length;
      try
        {
          for(int i=n-1;i-2>=i;--i){
            if(ch[i] == 'g'){
              else if(ch[i] == 'n')
              
            }
          }
        }
    }
    
  }