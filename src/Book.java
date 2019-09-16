public class Book {

    private String bookTitle;
    private String author;
    private String description;
    private double price;
    private Boolean isInStock = false;

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

    public Boolean getInStock() {
        return isInStock;
    }

    public void setInStock(Boolean inStock) {
        isInStock = inStock;
    }

    public Book(){}

    public Book (  String author, String bookTitle, String description){
        this.author = author;
        this.bookTitle = bookTitle;
        this.description = description;
    }

    public String getDisplayTitle(){

        return "The author of " + getBookTitle() + " is " + getAuthor() + ", and it is a " + getDescription();


    }

}

