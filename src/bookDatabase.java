import java.util.ArrayList;
import java.util.List;

public class bookDatabase {
    private Book book;
    private List<Book> books;

    public bookDatabase(){
        books = new ArrayList<>();
        books.add(new Book("Java1001","Head First Java",  "Kathy Sierra and Bert Bate", "Easy to read Java workbook",47.5, 5 ));
        books.add(new Book("Java1002","Thinking in Java", "Bruce Eckel", "Details Bates", 20.00, 9));
        books.add(new Book("Python1004","Automate the Boring Stuf with Python", "Al Sweigart", "Fun with Python", 10.50,2));
        books.add(new Book("Zombie1005","The Maker's Guide to the Zombie Apocalypse", "Simon Monk", "Defend Your Base with Simple Circuits", 16.50, 1));
        books.add(new Book("Rasp1006", "Raspberry Pi Projects for the Evil Genius", "Donald Norris", "A dozen fiendishly fun projects for the Raspberry Pi!", 14.75, 6))

    }

    public bookDatabase(String SKU){
        this();
        book = getBook(SKU);
    }

    public Book getBook(String SKU){
        Book b = new Book();
        for(Book book: books){
            if(SKU.equalsIgnoreCase(book.getSKU())){
                b = book;
            }else{
                System.out.println("We don't have it in stock.");
            }
        }
        return b;
    }

    public Book getBook() {
        return book;
    }

    public void setBook(Book book) {
        this.book = book;
    }

    public List<Book> getBooks() {
        return books;
    }

    public void setBooks(List<Book> books) {
        this.books = books;
    }
}
