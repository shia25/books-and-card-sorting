import java.io.File;
import java.io.FileNotFoundException;
import java.util.HashSet;
import java.util.Scanner;
import java.util.ArrayList;


public class BookCollection {
    private  ArrayList<Book> books= new ArrayList<Book>();

    //2, complete constructor that takes a string path (the BookList file name) load the books from BookList into the books arrayList
    //When complete books should have 100 items. Make sure you don't include the header row!
    BookCollection(ArrayList books){

    }

    BookCollection(String path) {
        try {
            //creates object fileBookList and initialized to read from file BookList.csv
            Scanner fileBookList;
            fileBookList = new Scanner(new File("LabAssignment1Done/BookList.csv"));

            // Skipping the header row
            if (fileBookList.hasNextLine()) {
                fileBookList.nextLine();
            }
                // Reading books from the file  BookList and adding them to the ArrayList
                while (fileBookList.hasNextLine()) {
                    String line = fileBookList.nextLine();
                    String[] column = line.split(",");
                    String title = column[0];
                    String author ;
                    author = column[1];
                    long isbn = Long.parseLong(column[2]);
                    int pages = Integer.parseInt(column[3]);
                    int copiesInCollection = Integer.parseInt(column[4]);
                    int copiesOnLoan = Integer.parseInt(column[5]);

                    Book book = new Book(title, author, isbn, pages, copiesInCollection, copiesOnLoan);
                    books.add(book);
                }

               fileBookList.close();

            } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        }

    }

    //3, Return a HashSet of all the authors in the book list
    public HashSet<String> getAuthors() {
        //creating object to store authors
        HashSet<String> authors = new HashSet<>();
        for (Book book : books) {
            authors.add(book.getAuthor());
        }
        return authors;
    }

    //4, return an arrayList of books with more than 750 pages
    public ArrayList<Book> getLongBooks() {
        //creating Arraylist to store Long books > 750 pages
        ArrayList<Book> longBooks = new ArrayList<>();
        for (Book book : books) {
            if (book.getPages() > 750) {
                longBooks.add(book);
            }
        }
        return longBooks;
    }


    //5, return the book if the given title is in the list.
    public Book getBookByTitle(String title) {
        //
        for (Book book : books) {
            if (book.getTitle().equals(title)) {
                return book;
            }
        }
        // If the book is not found it will return null
        return null;
    }

    //6, return an array of the 10 most popular books (That is those that currently have most copies on loan)
    public Book[] mostPopular() {
        // Sorting books by copies on loan in descending order
        books.sort((b1, b2) -> b2.getCopiesOnLoan() - b1.getCopiesOnLoan());

        // Creating an array to store the 10 most popular books
        int numBooks = Math.min(10, books.size());
        Book[] popularBooks = new Book[numBooks];
        for (int i = 0; i < numBooks; i++) {
            popularBooks[i] = books.get(i);
        }
        return popularBooks;
    }

}
