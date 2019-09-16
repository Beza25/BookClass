public class Book {

    private String bookTitle;
    private String author;
    private String description;
    private double price;
    private int isInStock;



    public Book(){

    }

    public Book (  String author, String bookTitle, String description){
        this.author = author;
        this.bookTitle = bookTitle;
        this.description = description;
    }
    public Book (  String author, String bookTitle, String description, double price, int isInStock){
        this.author = author;
        this.bookTitle = bookTitle;
        this.description = description;
        this.price = price;
        this.isInStock = isInStock;

    }
    public double caluclatePrice(int userInput){
        double bookPrice = 0;
        if( this.isInStock >= userInput){
            bookPrice = userInput * this.price;
        }
        return bookPrice;
    }

    public String getDisplayTitle(){

        return "The author of " + getBookTitle() + " is " + getAuthor() + ", and it is a " + getDescription();


    }

    public int getIsInStock() {
        return isInStock;
    }

    public void setIsInStock(int isInStock) {
        this.isInStock = isInStock;
    }


    public String getBookTitle() {
        return bookTitle;
    }

    public void setBookTitle(String bookTitle) {
        this.bookTitle = bookTitle;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

}

