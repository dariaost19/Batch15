package class19;

public class Book {
    //Write Book class that will have instance variables and 2 Constructors. While creating an object make sure:
    //Instance variables are being initialized
    //Both Constructors are being executed
    String bookName;
    String author;
    int pages;
    Book(String bookName,int pages){
        this.bookName=bookName;
        this.pages=pages;

    }
    Book(String bookName,String author,int pages){
        this(bookName,pages);
        this.author=author;

    }
    void BookInfo(){
        System.out.println(bookName+author+pages);
    }

    public static void main(String[] args) {
        Book book1=new Book(" Gulliver's Travels",352);
     book1.BookInfo();

       Book book2=new Book("The Old Man and the Sea","Ernest Hemingway",352);
        book2.BookInfo();


    }
}
