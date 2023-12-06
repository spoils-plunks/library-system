public class LibraryApp {
    public static void main(String[] args) {
        Book book1 = new Book("The Catcher in the Rye", "J.D. Salinger");
        Book book2 = new Book("To Kill a Mockingbird", "Harper Lee");

        BookItem bookItem1 = new BookItem(1, book1);
        BookItem bookItem2 = new BookItem(2, book2);

        Library library = new Library();
        library.addItem(bookItem1);
        library.addItem(bookItem2);

        library.displayLibraryItems();
    }
}
