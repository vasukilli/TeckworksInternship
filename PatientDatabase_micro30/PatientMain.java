import java.util.Scanner;
public class PatientMain
  {
    public static void main(String[] args)
    {
      char ch;
      int choice;
      Scanner sc = new Scanner(System.in);
      PatientImp patpobj = new PatientImp();
      System.out.println("1.add patient details");
      System.out.println("2.delete patient details");
      System.out.println("3.search patient details");
      System.out.println("4.display patient details");

      do{
        System.out.println("enter your choice");
        choice = sc.nextInt();
        switch(choice)
          {
            case 1 : patpobj.insert();
              break;
            case 2 : patpobj.delete();
              break;
            case 3 : patpobj.search();
              break;
            case 4 : patpobj.display();
              break;
              default : System.out.println("invalid choice");
          }
        System.out.println("do you want to continue one more option");
        ch = sc.next().charAt(0);
        
      }while(ch != 'n');
    }
  }