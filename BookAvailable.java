public class BookAvailable {

    private Book book;
    private boolean isAvailable;

    public BookAvailable(boolean isAvailable, Book book) {
        this.isAvailable = isAvailable;
        this.book = book;
    }

    public Book getBook() {
        return book;
    }

    public boolean isAvailable() {
        return isAvailable;
    }
}
