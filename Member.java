
import java.util.*;

public class Member { 
    private static  int idcounter=1;  
    private int id;
    String username;
    List<Book> Book = new ArrayList<>();

    public Member(String username) {
        this.id=idcounter++;
        this.username = username;
        this.Book = new ArrayList<>();
    }
    public String getUsername()
    {
        return username;
    }
    public  int getid()
    {
        return id;
    }

    public List<Book> gettBooks()
    {
        return Book;
    }


}
