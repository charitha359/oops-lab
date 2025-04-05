class Book {
    private String title;
    private boolean isIssued;
    
    public Book(String title) { 
        this.title = title; 
        this.isIssued = false; 
    }
    public String getTitle() { 
        return title; 
    }
    public boolean isIssued() { 
        return isIssued; 
    }
    public void issueBook() { 
        if (!isIssued) {
            isIssued = true;
            System.out.println(title + " has been issued.");
        } else {
            System.out.println(title + " is already issued.");
        }
    }
    public void returnBook() { 
        if (isIssued) {
            isIssued = false;
            System.out.println(title + " has been returned.");
        } else {
            System.out.println(title + " was not issued.");
        }
    }
}
public class LibrarySystem {
    public static void main(String[] args) {
        Book book1 = new Book("The Java Handbook");

        System.out.println("Title: " + book1.getTitle());
        System.out.println("Issued? " + book1.isIssued());

        book1.issueBook();
        book1.issueBook();  
        book1.returnBook();
        book1.returnBook();  
    }
}
