/*Creating a Book Class for a library system*/

package xCHALLENGES_01;

public class Book {

    static int totalNoOfBooks;
    String author;
    String title;
    String isbn;
    boolean isBorrowed;


    static{
        totalNoOfBooks=0;
    }

    {
        totalNoOfBooks++;
    }

    Book(String isbn, String title, String author){
        this.isbn=isbn;
        this.title=title;
        this.author=author;

    }

    Book(String isbn){
        this(isbn,"Unknown","Unknown");
    }

    static int getTotalNoOfBooks(){
        return totalNoOfBooks;
    }

    void borrowBook(){
        if(isBorrowed){
            System.out.println("Book is already Borrowed");
        }
        else{
            this.isBorrowed = true;
            System.out.println("Book " + this.title + " Issued Successfully. Enjoy!");
        }
    }

    void returnBook(){
        if(isBorrowed){
            this.isBorrowed=false;
            System.out.println("Hope you enjoyed. Please Leave a Review");
        }
        else{
            System.out.println("This book is already in the library");
        }
    }

    static void main(String[] args) {
        Book designOfThings = new Book("1","Design","Author");
        Book myBook = new Book("2");
        System.out.println(Book.getTotalNoOfBooks());
        designOfThings.borrowBook();
        myBook.borrowBook();
        designOfThings.borrowBook();
        designOfThings.returnBook();
        designOfThings.returnBook();
    }


}
