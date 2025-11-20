
import java.util.*;

public class Librarymanagementsystem extends LibManagementMain {

    static  List<Book> librarybooks = new ArrayList<>();
    static List<Member> userBooks = new ArrayList<>();
    static List<Member> members = new ArrayList<>();
    static
    {
        librarybooks.add(new Book("N", "Terry Pratchett", "Fantasy"));
        librarybooks.add(new Book("Na", "John Smith", "Travel"));
        librarybooks.add(new Book("Nat", "Terry Pratchett", "Fantasy"));
        librarybooks.add(new Book("Nati", "John Smith", "Travel"));
        librarybooks.add(new Book("Nati", "Terry Pratchett", "Fantasy"));
        librarybooks.add(new Book("Nation", "John Smith", "Travel"));
    }
    static{
        members.add(new  Member("user"));
    }
    public static void addmember() {
        System.out.println("enter name");
        String name = sc.next();
        members.add(new Member(name));
    }

    public static void displaymember() {
        for (Member m : members) {
            System.out.println("Member id: " + m.getid() + "member name: " + m.username);
            if (m.Book.isEmpty()) {
                System.out.println("no books found");
            } 
            for (Book b : m.Book) 
            {

                    System.out.println("Book title: " + b.gettitle() + "Book Author: " + b.getAuthor() + "  genre : "
                            + b.getgenre());
                
            }
        }
    }

    public static void addBook() {
        System.out.print("Enter title: ");
        String tit = sc.next();
        System.out.print("Enter author: ");
        String auth = sc.next();
        System.out.print("Enter genere: ");
        String genre = sc.next();
        librarybooks.add(new Book(tit, auth, genre));

    }

    public static void availablelibBooks() {
        for (Book libbBook : librarybooks) {
            System.out.println("bid: " + libbBook.getbookid() + "tit: " + libbBook.gettitle() + " aut: "
                    + libbBook.getAuthor() + "genre: " + libbBook.getgenre());
        }
    }

    public static void updatebook() {
        System.out.print("Enter Boom id: ");
        int id = sc.nextInt();
        System.out.println("Enter book tit: ");
        String tit = sc.next();
        System.out.println("Enter your author: ");
        String author = sc.next();
        System.out.println("Enter your genre");
        String genre = sc.next();
        for (Book liBook : librarybooks) {
            if (liBook.getbookid() == id && liBook.gettitle().equals(tit)) {
                liBook.setAuthor(author);
                liBook.setGenre(genre);
                System.out.println("updated duccessfully");
            }
        }

    }

    public static void removebook() {
        System.out.println("Enter book id:");
        int id = sc.nextInt();
        boolean remove = librarybooks.removeIf(a -> a.getbookid() == id);
        if (remove) {
            System.out.println("removed succesfully");
        } else {
            System.out.println("give id not bound");
        }
    } 

    public static void borrowbook() {
        System.out.println("Enter title: ");
        String tir = sc.next();
        Bookavailble b = isavailable(tir);
        System.out.println("1");
        if (b.getbool()) {
            System.out.println("2");
            for (Member m : members)
            {
                 System.out.println("Borroe count : "+(m.Book.size()+1));
                if(m.Book.size()>4)
                {
                    System.out.println("limit excedded");
                }
                if (m.getUsername().equals("user") && m.Book.size()<=4) {
                    System.out.println("hjkl");
                    m.Book.add(b.getboBook());
                    librarybooks.remove(b.getboBook());
                }
            }
        }
    }

    public static void returnBook() {
        System.out.println("Enter book title");
        String tit = sc.next();
        boolean bools = false;
        Book bs = null;
        Member ms = null;
        for (Member m : members) {
            for (Book books : m.gettBooks()) {
                if (m.getUsername().equals("user") && books.gettitle().equals(tit)) {

                    bools = true;
                    bs = books;
                    ms = m;
                }
            }
        }
        if (bools) {
            librarybooks.add(bs);
            ms.Book.remove(bs);
            System.out.println("return succ");

        } else {
            System.out.println("return failed");
        }

    }

    public static Bookavailble isavailable(String title) {
        boolean have = false;
        for (Book lib : librarybooks) {
            if (lib.gettitle().equals(title)) {
                have = true;

                return new Bookavailble(have, lib);
            }
        }
        return new Bookavailble(have, null);
    }

}