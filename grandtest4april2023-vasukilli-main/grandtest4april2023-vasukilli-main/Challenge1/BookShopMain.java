/* /* void addBooks();
    void total_priceOfAllBooks();
    ;void removeBookById()
    void updateBookPriceById();
    void searchBookByAuthor();//BookNotFoundException
    void exit();*/
import java.util.*;
class BookShopMain
  {
    public static void main(String[] args)
    {
      char ch;
      int choice;
      Scanner sc = new Scanner(System.in);
      BookShopImplement bsi = new BookShopImplement();
      System.out.println("1.add book details");
      System.out.println("2.total price of all books");
      System.out.println("3.remove book by id");
      System.out.println("4.update book price by id");
      System.out.println("5.search book by author");
      System.out.println("6.existing...");
      
      do{
        System.out.println("enter your choice");
        choice = sc.nextInt();
        switch(choice)
          {
            case 1 : bsi.addBooks();
              break;
            case 2 : bsi.total_priceOfAllBooks();
              break;
            case 3 : bsi.removeBookById();
              break;
            case 4 : bsi.updateBookPriceById();
              break;
            case 5 :
              try{
                bsi.searchBookByAuthor();
              }catch(BookNotFoundException b){
                System.out.println(b.getMessage());
                }
              break;
            case 6 : bsi.exit();
              break;
              default : System.out.println("invalid choice");
          }
        System.out.println("do you want to continue one more option");
        ch = sc.next().charAt(0);
      }
        while(ch != 'n');
    }
  }