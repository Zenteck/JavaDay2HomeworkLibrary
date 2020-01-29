import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class BookThiefTest {

    private BookThief bookThief;
    public Library library;
    public Book book1;
    public Book book2;

    @Before
    public void before(){
        bookThief = new BookThief();
        book1 = new Book("Leviathan Wakes", "James SA Corey", "Sci-fi");
        book2 = new Book("The Winds of Winter", "N/A", "fantasy");
        library = new Library();
        library.addBook(book1);
        library.addBook(book2);

    }

    @Test
    public void canStealBook(){
        bookThief.stealBook();
        assertEquals(1, bookThief.stash.size());
    }

}
