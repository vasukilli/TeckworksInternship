/*
Challenge- 1: 

As a manager of a book shop, you are responsible for managing all the operations related to books in the shop. You have a system that stores all the book details(book_id, title, author, price) in an ArrayList of Book objects. 

Your task is to create a Java program that helps you manage the book shop efficiently.  

Create a console-based menu-driven program that allows the user to perform the following operations: 

1. Add books 

2. Calculate total price of all books 

3. Remove a book by book_id 

4. Update book price by book_id 

5. Search books by author 

6. Quit the program 

If no books are found for the given author name, the method should throw a custom exception called BookNotFoundException with an appropriate error message. 

Each menu option should call the corresponding method and display the results or appropriate error messages. 
*/
class BookShopData
  {
    int book_id;
    String title;
    String author;
    double price;
    public BookShopData(int bi , String t , String a , String p){
      book_id = bi;
      title = t;
      author = a;
      price = p;
    }
	public int getBook_id() {
		return book_id;
	}
	
	public String getTitle() {
		return title;
	}
	
	public String getAuthor() {
		return author;
	}
	
	public double getPrice() {
		return price;
	}
	public String toString(){
    return book_id + " " + title + " " + author + " " + price ;
  }
    
    
  }