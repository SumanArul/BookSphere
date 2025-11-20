
public class Book {

    private int idcounters = 1;
    private String title, Author, genre;
    private Boolean isavailable;
    private int id;

    public Book(String title, String Author, String genre) {
        this.id = idcounters++;
        this.title = title;
        this.Author = Author;
        this.genre = genre;
        this.isavailable = true;
    }

    public int getbookid() {
        return id;
    }

    public String gettitle() {
        return title;
    }

    public void settitle(String title) {
        this.title = title;
    }

    public String getAuthor() {
        return Author;
    }

    public void setAuthor(String Author) {
        this.Author = Author;
    }

    public String getgenre() {
        return genre;
    }

    public void setGenre(String genre) {
        this.genre = genre;
    }

    public boolean getbookisavailable() {
        return isavailable;
    }

    public void setbookisavailable(boolean isavailable) {
        this.isavailable = isavailable;
    }
}
