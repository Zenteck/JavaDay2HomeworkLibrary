import java.util.ArrayList;

public class Library {

    private int capacity = 3;
    public ArrayList<Book> collection;

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

    public void removeBook(Book book) {
        this.collection.remove(book);
    }
}
