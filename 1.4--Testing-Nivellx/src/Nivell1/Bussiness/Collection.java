package Nivell1.Bussiness;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public class Collection {
    private List<Book> books;
    private final String name;

    public Collection(String name) {
        this.name = name;
        this.books = new ArrayList<>();
    }

    public String getName() {
        return name;
    }

    public void addBook(Book book) {
        books.add(book);
    }

    public List<Book> getBooks() {
        return new ArrayList<>(books);
    }
    public void showBooks(List<Book> books) {
        for (Book book : books) {
            System.out.println(book);
        }
    }

    public Book getBookByIndex(int index) throws IndexOutOfBoundsException {
        if (index < 0 || index >= books.size()) {
            throw new IndexOutOfBoundsException("Index out of bounds");
        }
        return books.get(index);
    }

    public void addBookAtIndex(int index, Book book) throws IndexOutOfBoundsException {
        if (index < 0 || index > books.size()) {
            throw new IndexOutOfBoundsException("Index out of bounds");
        }
        books.add(index, book);
    }

    public boolean removeBookByTitle(String title) {
        return books.removeIf(book -> book.getTitle().equals(title));
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (!(obj instanceof Collection)) return false;
        Collection that = (Collection) obj;
        return Objects.equals(name, that.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name);
    }

    @Override
    public String toString() {
        return name;
    }


}
