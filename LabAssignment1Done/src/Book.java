public class Book {
    private String title;
    private String author;
    private long isbn;
    private int pages;
    private int copiesInCollection;
    private int copiesOnLoan;

    public Book(String title, String author, long isbn, int pages, int copiesInCollection, int copiesOnLoan) {
        this.title = title;
        this.author = author;
        this.isbn = isbn;
        this.pages = pages;
        this.copiesInCollection = copiesInCollection;
        this.copiesOnLoan = copiesOnLoan;
    }

    // Getters
    public String getTitle() {
        return title;
    }

    public String getAuthor() {
        return author;
    }

    public long getIsbn() {
        return isbn;
    }

    public int getPages() {
        return pages;
    }

    public int getCopiesInCollection() {
        return copiesInCollection;
    }

    public int getCopiesOnLoan() {
        return copiesOnLoan;
    }

    // Setters
    public void setTitle(String title) {
        this.title = title;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public void setIsbn(long isbn) {
        this.isbn = isbn;
    }

    public void setPages(int pages) {
        this.pages = pages;
    }

    public void setCopiesInCollection(int copiesInCollection) {
        this.copiesInCollection = copiesInCollection;
    }

    public void setCopiesOnLoan(int copiesOnLoan) {
        this.copiesOnLoan = copiesOnLoan;
    }
}
