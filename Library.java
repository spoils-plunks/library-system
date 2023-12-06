import java.util.ArrayList;
import java.util.List;

public class Library {
    private List<LibraryItem> items;

    public Library() {
        this.items = new ArrayList<>();
    }

    public void addItem(LibraryItem item) {
        items.add(item);
    }

    public void displayLibraryItems() {
        for (LibraryItem item : items) {
            item.displayDetails();
            System.out.println("------------------------------");
        }
    }
}
