//Address Book: Create a class called AddressBook that stores a collection of contacts in a HashMap. The class should have methods to add, edit, and delete contacts, as well as to search for a contact by name.
import java.util.*;
public class AddressBookMain
  {
    public static void main(String[] args)
    {
      Scanner sc = new Scanner(System.in);
      AddressBookImp abi = new AddressBookImp();

      System.out.println("this is the address book");
      System.out.println("1.add details");
      System.out.println("2.edit details");
      System.out.println("3.delete contact details");
      System.out.println("4.search for contact by name details");

      //System.out.println("enter the option between 1 to 4");
      int n ;
      char ch;

      do{
        System.out.println("enter the option between 1 to 4");
       n = sc.nextInt();
        switch(n){
          case 1 : abi.add();
            break;
          case 2 :abi.edit() ;
            break;
          case 3 :abi.delete_contact() ;
            break;
          case 4 :abi.search_cont_name() ;
            break;
            
        }
        System.out.println("you want one more option then enter y");
        ch = sc.next().charAt(0);
      }while( ch != 'n');
    }
  }
