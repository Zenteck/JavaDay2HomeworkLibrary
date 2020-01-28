import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;

import static org.junit.Assert.assertEquals;

public class LibraryTest {

    private Library library;
    private Book book1;
    private Book book2;

    @Before
    public void before(){

        library = new Library();
        book1 = new Book("Leviathan Wakes", "James SA Corey", "Sci-fi");
        book2 = new Book("A Dream of Spring", "nobody", "fantasy");
        ArrayList<Book> collection = new ArrayList<>();
//        library.addBook(book1);
//        library.addBook(book2);

    }

    @Test
    public void canAddBookToCollection(){
        library.addBook(book1);
       assertEquals(1, library.countCollection());

    }





}
