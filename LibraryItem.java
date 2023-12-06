public abstract class LibraryItem {
    private int itemId;
    private String title;

    public LibraryItem(int itemId, String title) {
        this.itemId = itemId;
        this.title = title;
    }

    // Getters and setters for itemId and title
    public abstract void displayDetails();
}
