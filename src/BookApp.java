import java.sql.SQLOutput;
import java.util.Scanner;

public class BookApp {
    public static void main(String[] args){
        Scanner input = new Scanner (System.in);

        Book b1 = new Book("Michelle Obama", "Becoming Michelle", "Memoir." );
        System.out.println( b1.getDisplayTitle());
        Book book2 = new Book("Paula Hawkins", "The Girl on the train", "fiction", 22.5, 5 );
        System.out.println( book2.getDisplayTitle());

        System.out.println("Enter the title of the book you would like to purchase");
        String book = input.nextLine();

        System.out.println("How many do you want?");
        int userInput = input.nextInt();

        if(book.equalsIgnoreCase(book2.getBookTitle())){
            System.out.println("Please pay $" + book2.caluclatePrice(userInput));

        }else{
            System.out.println("The book you requested is out of stock. Try another time!");
        }
        System.out.println("Bye!");





    }


}
