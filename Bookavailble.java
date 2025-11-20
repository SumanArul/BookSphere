public class Bookavailble {
   private Book book;
    private Boolean bool;
    // String title;
    public Bookavailble(boolean bool,Book book)
    {
       this.bool=bool;
       this.book=book;  
     
    }
   public Book getboBook()
   {
    return book;
   }
   public boolean getbool()
   {
    return bool;
   }
}
