/* void addBooks();
    void total_priceOfAllBooks();
    ;void removeBookById()
    void updateBookPriceById();
    void searchBookByAuthor();//BookNotFoundException
    void exit();
    
If no books are found for the given author name, the method should throw a custom exception called BookNotFoundException with an appropriate error message. 
*/
import java.util.*;
import java.util.ArrayList;
class BookNotFoundException extends Exception
  {
    public BookNotFoundException(String message){
      super(message);
    }
  }
class BookShopImplement implements BookShopInter
  {
    ArrayList<BookShopData> bd = new ArrayList<>();
    Scanner sc = new Scanner(System.in);

    public void addBooks()
    {
      System.out.println("enter books details as book id , title , author  and price");
      int bi = sc.nextInt();
      String t = sc.next();
      String a = sc.next();
      double p = sc.nextDouble();
      bd.add(new BookShopData(bi,t,a,p));
    }
    public void total_priceOfAllBooks()
    {
      if(bd.size() == 0){
        System.out.println("no data available for find the total book cost");
      }else{
        String verify = null;
        for(BookShopData e : bd)
        {
          int count = 0;
          for(int i=0;i<bd.length;){
            count = e[3] + count;
            i++;
            verify = "found";
            break;
          }
        }if(verify == found){
          System.out.println("the total cost of the books is :" + count);
        }
        
      }
    }
    public void removeBookById()
    {
      if(bd.size() == 0){
        System.out.println("no data available remove book by id");
      }else{
        String verify = null;
        System.out.println("enter book id");
        int bid = sc.nextInt();
        for(BookShopData e : bd)
        {
          if(e.getBook_id() == bid){
            bd.remove(e);
            verify = "found";
            break;
          }
        }if(verify == found){
          System.out.println("the book removed from store");
        }
        
      }
    }
    public void updateBookPriceById()
    {
       if(bd.size() == 0){
        System.out.println("no data available for updating the book price");
      }else{
        String verify = null;
        System.out.println("enter book id");
        int bid = sc.nextInt();
        for(BookShopData e : bd)
        {
          if(e.getBook_id() == bid){
            System.out.println("Enter updated price value");
            int pcval = sc.nextInt();
            bd.add(3,pcval);
            verify = "found";
            break;
          }
        }if(verify == found){
          System.out.println("the book price updated");
        }
        
      }
      
    }
    public void searchBookByAuthor()
    {
      if(bd.size() == 0){
        System.out.println("no data available for searching book");
      }else{
        String verify = null;
        
        try{
        System.out.println("enter book author");
        String bau = sc.next();
        }catch(BookNotFoundException b){
          System.out.println("enter valid book author only");
          searchBookByAuthor();
        }
        for(BookShopData e : bd)
        {
          if(e.getAuthor() == bau){
      
            verify = "found";
            break;
          }
        }if(verify == found){
          System.out.println("the book searched succesfully");
        }
        
      }
      
      
    }
    public void exit()
    {
      System.out.println("existing the process");
    }
    
  }
