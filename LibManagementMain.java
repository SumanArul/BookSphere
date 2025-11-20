
import java.util.Scanner;

public class LibManagementMain {

    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        while (true) {
            System.out.print("Enter your role(admin/user)");
            String choice = sc.next();
            switch (choice) {
                case "admin":                   
                    System.out.print("Enter admin name ");
                    String name = sc.next();
                    System.out.print("Enter your password ");
                    String password = sc.next();
                    if (name.equals("admin") && password.equals("123")) {
                        System.out.println("Login successfully as admin");
                        adminaccess();
                    } else {
                        System.out.println("loggin failed");
                        break;
                    }
                case "user":
                    System.out.print("Enter user name ");
                    String uname = sc.next();
                    System.out.print("Enter your password ");
                    String upassword = sc.next();
                    if (uname.equals("user") && upassword.equals("password")) {
                        System.out.println("loggined succesfully as user");
                        useraccess();

                        break;
                    } else {
                        System.out.println("loggin failed");
                        break;
                    }
                default:
                    return;
            }
        }
    }

    public static void adminaccess() {
        while (true) {
            System.out.print("1:Add book\n2:update book\n3:remove book\n4:display Book\n 5:display user\n6:Exit");
            System.out.print("Enter your choice here");
            int n = sc.nextInt();
            switch (n) {
                case 0:
                    Librarymanagementsystem.addmember();
                    break;
                case 1:
                    Librarymanagementsystem.addBook();
                    break;
                case 2:
                    Librarymanagementsystem.updatebook();
                    break;
                case 3:
                    Librarymanagementsystem.removebook();
                    break;
                case 4:
                    Librarymanagementsystem.availablelibBooks();
                    break;
                case 5:
                    Librarymanagementsystem.displaymember();
                    break;
                case 6:
                    System.out.println("thank u----------");
                    return;

            }
        }
    }
    public static void useraccess() {
        while (true) {
            System.out.print("1:Borrow book\n2:return book \n3:display book\n 4:display member\n5:exit");
            System.out.print("Enter your choice here");
            int n = sc.nextInt();
            switch (n) {
                case 1:
                    Librarymanagementsystem.borrowbook();
                    break;
                case 2:
                    Librarymanagementsystem.returnBook();
                    break;
                case 3:
                   Librarymanagementsystem.availablelibBooks();
                   break;
                case 4:
                     Librarymanagementsystem.displaymember();
                     break;
                case 5:
                    System.out.println("thank u----------");
                    return;

            }
        }
    }
}
