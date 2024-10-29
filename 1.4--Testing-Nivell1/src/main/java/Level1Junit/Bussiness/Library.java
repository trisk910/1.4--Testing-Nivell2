package Level1Junit.Bussiness;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Objects;

public class Library {
    private List<Book> books;
    private final String name;

    public Library(String name) {
        this.name = name;
        this.books = new ArrayList<>();
    }

    public void addBook(Book book) {
        if (books.stream().noneMatch(b -> b.getTitle().equals(book.getTitle()))) {
            books.add(book);
            books.sort(Comparator.comparing(Book::getTitle));
        }
    }

    public List<Book> getBooks() {
        return new ArrayList<>(books);
    }

    public void showBooks() {
        if (books.isEmpty()) {
            System.out.println("No hi ha llibres a la col·lecció.");
        } else {
            for (Book book : books) {
                System.out.println("-" + book);
            }
        }
    }

    public Book getBookByIndex(int index) throws IndexOutOfBoundsException {
        if (index < 0 || index >= books.size()) {
            throw new IndexOutOfBoundsException("Llibre no trobat\n.");
        }
        return books.get(index);
    }

    public void addBookAtIndex(int index, Book book) throws IndexOutOfBoundsException {
        if (index < 0 || index > books.size()) {
            throw new IndexOutOfBoundsException("Index out of bounds");
        }
        if (books.stream().noneMatch(b -> b.getTitle().equals(book.getTitle()))) {
            books.add(index, book);
            books.sort(Comparator.comparing(Book::getTitle));
        }
    }

    public boolean removeBookByTitle(String title) {
        boolean removed = books.removeIf(book -> book.getTitle().equals(title));
        if (removed) {
            books.sort(Comparator.comparing(Book::getTitle));
        }
        return removed;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (!(obj instanceof Library)) return false;
        Library that = (Library) obj;
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