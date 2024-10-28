package Level1.Bussiness;

import java.util.List;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;


class LibraryTest {
    private Library library;

    @DisplayName("Creates a new Library")
    @BeforeEach
    public void setUp() {
        library = new Library("Test Library1");
    }

    @org.junit.jupiter.api.Test
    void testBooksListIsNotNull() {
        assertNotNull(library.getBooks());
    }

    @org.junit.jupiter.api.Test
    void testBookInCorrectPosition() {
        library.addBook(new Book("Book 1"));
        library.addBook(new Book("Book 2"));
        library.addBook(new Book("Book 3"));
        assertEquals("Book 2", library.getBookByIndex(1).getTitle());
    }

    @org.junit.jupiter.api.Test
    void testNoDuplicateBookTitles() {
        library.addBook(new Book("Book 1"));
        library.addBook(new Book("Book 2"));
        library.addBook(new Book("Book 1"));
        List<Book> books = library.getBooks();
        long count = books.stream().filter(book -> book.getTitle().equals("Book 1")).count();
        assertEquals(1, count);
    }

    @org.junit.jupiter.api.Test
    void testRetrieveBookTitleByPosition() {
        library.addBook(new Book("Book 1"));
        library.addBook(new Book("Book 2"));
        assertEquals("Book 2", library.getBookByIndex(1).getTitle());
    }

    @org.junit.jupiter.api.Test
    void testAddBookModifiesList() {
        library.addBook(new Book("Book 1"));
        assertEquals(1, library.getBooks().size());
        assertEquals("Book 1", library.getBooks().get(0).getTitle());
    }

    @org.junit.jupiter.api.Test
    void testRemoveBookDecreasesListSize() {
        library.addBook(new Book("Book 1"));
        library.addBook(new Book("Book 2"));
        library.removeBookByTitle("Book 1");
        assertEquals(1, library.getBooks().size());
    }

    @Test
    void testListIsAlphabeticallyOrdered() {
        library.addBook(new Book("Book C"));
        library.addBook(new Book("Book A"));
        library.addBook(new Book("Book B"));
        List<Book> books = library.getBooks();
        assertEquals("Book A", books.get(0).getTitle());
        assertEquals("Book B", books.get(1).getTitle());
        assertEquals("Book C", books.get(2).getTitle());
    }
}
