public class BookItem extends LibraryItem {
    private Book book;
    private boolean isAvailable;

    public BookItem(int itemId, Book book) {
        super(itemId, book.getTitle());
        this.book = book;
        this.isAvailable = true;
    }

    // Getters and setters for book and isAvailable
    @Override
    public void displayDetails() {
        System.out.println("Book ID: " + getItemId());
        System.out.println("Title: " + getTitle());
        System.out.println("Author: " + book.getAuthor());
        System.out.println("Available: " + isAvailable);
    }
}
