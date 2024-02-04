import java.util.ArrayList;
import java.util.HashSet;
import java.util.Scanner;

public class BookMain {
    public static void main(String[] args) {
        BookCollection bCollection = new BookCollection("LabAssignment1Done/BookList.csv");

        // Get authors and print them
        HashSet<String> authors = bCollection.getAuthors();
        System.out.println("Authors in the collection: " + authors);

        System.out.println();

        // Getting long books
        ArrayList<Book> longBooks = bCollection.getLongBooks();
        System.out.println("Books with more than 750 pages:");
        for (Book book : longBooks) {
            System.out.println(book.getTitle() + " by " + book.getAuthor());
        }

        System.out.println();

        //Getting the 10 most popular books From BookList
        Book[] popularBooks = bCollection.mostPopular();
        System.out.println("The 10 most popular books:");
        for (Book book : popularBooks) {
            System.out.println(book.getTitle() + " by " + book.getAuthor() + " - Copies on loan: " + book.getCopiesOnLoan());
        }

        System.out.println();

        //Getting a book by title
//        String titleToFind = "Metamorphosis";
//        Book foundBook = bCollection.getBookByTitle(titleToFind);
//        if (foundBook != null) {
//            System.out.println("Book found: " + foundBook.getTitle() + " by " + foundBook.getAuthor());
//        } else {
//            System.out.println("Book not found: " + titleToFind);
//        }


        //Books are be retrieved by a given title
        // user can search for a book by title
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter title to search for a book: ");
        String userTitle = scan.nextLine();
        Book foundBook= bCollection.getBookByTitle(userTitle);
        if (foundBook != null) {
            System.out.println("Book found: " + foundBook.getTitle() + " by " + foundBook.getAuthor());
        } else {
            System.out.println("Book not found: " + userTitle);
        }


    }
}
