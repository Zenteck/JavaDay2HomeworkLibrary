import java.util.ArrayList;

public class Library {

    private int capacity = 3;
    private ArrayList<Book> collection;

    public Library() {
        this.collection = new ArrayList<>();
    }

    public int countCollection() {
        return this.collection.size();
    }

    public void addBook(Book book) {
        if(this.countCollection() < this.capacity) {
            this.collection.add(book);
        }
    }
}
