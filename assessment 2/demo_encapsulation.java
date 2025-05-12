class Book
 {
    private int book_id;
    private String title;
    private String author;
    private int copiesAvailable;

    public int getbook_id()
    {
        return book_id;
    }
    public void setbook_id(int book_id) 
    { 
        this.book_id = book_id; 
    }

    public String getTitle() 
    { 
        return title; 
    }
    public void setTitle(String title) 
    { 
        this.title = title; 
    }

    public String getAuthor() 
    {
        return author; 
    }
    public void setAuthor(String author) 
    { 
        this.author = author; 
    }

    public int getCopiesAvailable() 
    { 
        return copiesAvailable; 
    }
    public void setCopiesAvailable(int copiesAvailable) 
    {
        this.copiesAvailable = copiesAvailable; 
    }
}

public class demo_encapsulation
{
    public static void main(String[] args) {
    Book book = new Book();
    book.setbook_id(9780);
    book.setTitle("programming in java");
    book.setAuthor("John");
    book.setCopiesAvailable(5);

    System.out.println("Book ID: " + book.getbook_id());
    System.out.println("Title: " + book.getTitle());
    }
}
