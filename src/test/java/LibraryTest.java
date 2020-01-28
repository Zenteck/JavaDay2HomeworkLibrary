import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;

import static org.junit.Assert.assertEquals;

public class LibraryTest {

    private Library library;
    private Book book1;
    private Book book2;
    private Book book3;
    private Book book4;

    @Before
    public void before(){

        library = new Library();
        book1 = new Book("Leviathan Wakes", "James SA Corey", "Sci-fi");
        book2 = new Book("A Dream of Spring", "nobody", "fantasy");
        book3 = new Book("Fulgrim","Graham Mcneil", "Sci-fi");
        book4 = new Book("Zen and the Art", "Robert M. Pirsig", "autobiography");
        library.addBook(book1);
        library.addBook(book2);
//        ArrayList<Book> collection = new ArrayList<>();

    }

    @Test
    public void canAddBookToCollection(){
        library.addBook(book3);
       assertEquals(3, library.countCollection());

    }

    @Test
    public void cannotAddBookOverCapacity(){
        library.addBook(book3);
        library.addBook(book4);
        assertEquals(3, library.countCollection());
    }

    @Test
    public void canRemoveBook(){
        library.removeBook(book1);
        assertEquals(1, library.countCollection());
    }


}
