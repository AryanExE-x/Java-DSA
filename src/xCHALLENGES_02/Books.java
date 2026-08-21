package xCHALLENGES_02;

/*blocks->constructors->methods*/
/*static variables->nonstatic variables->static block->normal block->constructors->methods*/

import java.sql.SQLOutput;

public class Books {
    static int totalBooks;
    String title;
    String author;
    int isbn;
    boolean isBorrowed;

    static{   /*only when the class loads*/ //only once at the start of the program
        totalBooks=0;
    }

    {   /*everytime an object is created*/
        totalBooks++;
    }

    Books(int isbn,String title,String author){
        this.isbn=isbn;
        this.title=title;
        this.author=author;
    }

    Books(int isbn){
        this(isbn,"Unknown","Unknown");
    }


    public void borrowBook(){

        if(isBorrowed){
            System.out.println("Book is already borrowed!");
        }
        else{
            this.isBorrowed=true;
            System.out.printf("Book-> %s is being issued from the library. This is your token number (%d)",this.title,this.isbn);
            System.out.println();
            totalBooks--;
        }
    }

    public void returnBook(){

        if(isBorrowed){
            this.isBorrowed=false;
            System.out.printf("Dear Customer, you have returned the book code %d (%s) back to the library",this.isbn,this.title);
            System.out.println();
            totalBooks++;
        }
        else{
            System.out.println("This Book is already in the library...");
        }
    }

    public static int getTotalBooks(){
        return totalBooks;
    }

    static void main(String[] args) {
        Books Design= new Books(1,"DesignOfNewThings","Author");
        Books myBook= new Books(2);
        System.out.println(Books.getTotalBooks());
        Design.borrowBook();
        Design.borrowBook();
        Design.returnBook();
        Design.returnBook();
    }
}
