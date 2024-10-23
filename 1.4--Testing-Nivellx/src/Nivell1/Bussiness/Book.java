package Nivell1.Bussiness;

import java.util.Objects;

public class Book {

    private final String title;

    public Book(String title) {
        this.title = title;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (!(obj instanceof Book)) return false;
        Book that = (Book) obj;
        return title == that.title;
    }
    @Override
    public int hashCode() {
        return Objects.hash(title);
    }

    @Override
    public String toString() {
        return title;
    }
}
